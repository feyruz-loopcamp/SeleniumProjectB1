package com.loop.test.testNG_stale_element;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.time.Duration;

public class T0_StaleElementException {

    public static void main(String[] args) throws InterruptedException {

//        1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();

        Thread.sleep(3000);

        WebElement deleteElement = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        System.out.println("deleteElement.isSelected() = " + deleteElement.isDisplayed());

        deleteElement.click();


        try {
            deleteElement.isDisplayed();
        } catch(StaleElementReferenceException e){
            System.out.println("Exception handled");
        }











    }
}
