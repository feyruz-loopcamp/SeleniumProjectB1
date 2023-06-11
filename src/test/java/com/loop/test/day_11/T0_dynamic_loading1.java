package com.loop.test.day_11;

import com.loop.pages.LoopPracticeDynamicLoading;
import com.loop.pages.LoopPracticeDynamicLoading1;
import com.loop.test.Utilities.BrowserUtils;
import com.loop.test.Utilities.ConfigurationReader;
import com.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T0_dynamic_loading1 {

    /*
    1. go to https://loopcamp.vercel.app/dynamic_loading/1.html
    2. click start
    3. wait loading bar disappears
    4. validate username is displayed
    5. enter username tomsmith
    6. enter password incorrectpassword
    7. click submit button
    8. validate "Your password is invalid" is displayed
     */


    LoopPracticeDynamicLoading1 page;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        page = new LoopPracticeDynamicLoading1();
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
    }

    @Test
    public void test_method(){
        BrowserUtils.loopLinkClick("Dynamic Loading");
        wait.until(ExpectedConditions.elementToBeClickable(page.dynamicLoading1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(page.startButton)).click();
        wait.until(ExpectedConditions.invisibilityOf(page.loadingBar));
        wait.until(ExpectedConditions.visibilityOf(page.userName));
        Assert.assertTrue(page.userName.isDisplayed());
        page.userName.sendKeys("tomsmith");
        page.password.sendKeys("incorrectpassword");
        page.submitButton.click();
        Assert.assertTrue(page.errorMessage.isDisplayed());
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}
