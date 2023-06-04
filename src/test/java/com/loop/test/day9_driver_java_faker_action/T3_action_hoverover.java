package com.loop.test.day9_driver_java_faker_action;

import com.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T3_action_hoverover {

    /*
    1. Go to https://www.google.com
    2. Hover over on Search button
    3. Hover over on Feeling Lucky button
     */


    @Test
    public void google_actions_hover() throws InterruptedException {

        Driver.getDriver().get("https://www.google.com");

        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));

        WebElement feelingLucky = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(googleSearch).perform();

        Thread.sleep(3000);

        action.moveToElement(feelingLucky).perform();




    }

}
