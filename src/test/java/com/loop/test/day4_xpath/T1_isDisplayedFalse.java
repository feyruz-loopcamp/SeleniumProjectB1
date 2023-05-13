package com.loop.test.day4_xpath;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_isDisplayedFalse {

    /*
    1. Open a Chrome browser
    2. Go to: https://www.tesla.com
    3. Locate Solar Panels header
    4. Verify if it is displayed on the page

     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.tesla.com");

        WebElement element = driver.findElement(By.xpath("(//h1[contains(text(),'Solar Panel')])[1]"));

        System.out.println(element.isDisplayed());



    }
}
