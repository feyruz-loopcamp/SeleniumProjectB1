package com.loop.test.day9_driver_java_faker_action;

import com.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T1_google_search {

    /*
    1. go to "https://www.google.com"
    2. write "Loop Academy"
    3. validate title: Loop Academy - Google Search
     */

    @Test
    public void google_search(){

        Driver.getDriver().get("https://www.google.com");
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

        WebElement element = Driver.getDriver().findElement(By.name("q"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

        element.sendKeys("Loop Academy" + Keys.ENTER);

        assertEquals(Driver.getDriver().getTitle(), "Loop Academy - Google Search");

    }

    @Test
    public void docuport_search(){

        Driver.getDriver().get("https://beta.docuport.app");
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());


    }
}
