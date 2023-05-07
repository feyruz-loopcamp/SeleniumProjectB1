package com.loop.test.day2_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {

    /*
     * go to url: https://demoqa.com/automation-practice-form
     * verify header text expected
     * verify placeholder attribute value is expected
     */

    public static void main(String[] args) {
        // go url
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        // get the header
        String actualHeader = driver.findElement(By.tagName("h5")).getText();


        // get placeholder
        WebElement firtsName = driver.findElement(By.id("firstName"));
        System.out.println(firtsName.getText() + " -this is get text");
        System.out.println(firtsName.getAttribute("placeholder") + " this is get attribute");



    }


}
