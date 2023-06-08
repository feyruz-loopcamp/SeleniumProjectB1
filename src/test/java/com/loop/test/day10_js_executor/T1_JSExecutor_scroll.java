package com.loop.test.day10_js_executor;

import com.github.javafaker.Faker;
import com.loop.test.Utilities.ConfigurationReader;
import com.loop.test.Utilities.Driver;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_JSExecutor_scroll {

    /*
    1. Go to https://www.etsy.com
    2. Scroll down
    3. Generate random email and enter into subscribe box
    4. Click on Subscribe
    5. Verify "Great! We've sent you an email to confirm your subscription." is displayed
     */

    @Test
    public void etsy_scroll() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        // x for horizontal  y vertica;
//        js.executeScript("window.scrollBy(0,5000)");
//        Thread.sleep(3000);
//        js.executeScript("window.scrollBy(0,-5000)");

        WebElement emailBox = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));

//        js.executeScript("arguments[0].scrollIntoView(true)",emailBox);
//        Faker faker = new Faker();
//        emailBox.sendKeys(faker.internet().emailAddress());

//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(emailBox).perform();
//
//        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
    }
}

