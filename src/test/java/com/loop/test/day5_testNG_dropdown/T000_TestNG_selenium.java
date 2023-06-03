package com.loop.test.day5_testNG_dropdown;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T000_TestNG_selenium {

    // set up chrome and create driver
    // go to google.com
    // Assert; title is "Google"
    WebDriver driver;
    String actualTitle;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void googleTitle(){
        driver.get("https://www.google.com/");
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Google");
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
    }

    @Test
    public void docuportTitle(){
        driver.get("https://beta.docuport.app");
        actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Docuport"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
    }


    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}
