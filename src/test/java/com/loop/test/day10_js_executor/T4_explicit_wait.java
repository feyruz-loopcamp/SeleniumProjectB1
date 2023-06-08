package com.loop.test.day10_js_executor;

import com.loop.pages.LoopPracticeDynamicLoading;
import com.loop.test.Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class T4_explicit_wait {

    /*
            1. go https://loopcamp.vercel.app/dynamic_loading/7.html
            2. Wait until title is “Dynamic title”
            3. Assert: Message “Done!” is displayed.
            4. Assert: Image is displayed.
     */


    LoopPracticeDynamicLoading page;

    @BeforeMethod
    public void setUp(){
        page = new LoopPracticeDynamicLoading();
        Driver.getDriver().get("https://loopcamp.vercel.app/dynamic_loading/7.html");
    }

    @Test
    public void waitTest(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));


        Assert.assertEquals(page.doneMessage.getText(), "Done!");
        Assert.assertTrue(page.image.isDisplayed());
    }


}
