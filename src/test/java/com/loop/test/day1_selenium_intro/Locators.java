package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // docuport
        driver.get("http://www.google.com/");

        WebElement element;
        element = driver.findElement(By.linkText("About"));
        element.click();

        String expectedTitleAbout ="About Google, Our Culture & Company News";
        String actualAbout = driver.getTitle();

        if (actualAbout.contains(expectedTitleAbout)) {
            System.out.println("Expected title: " + expectedTitleAbout + ", matches actual title: " + actualAbout );
        } else {
            System.out.println("Expected title: " + expectedTitleAbout + ", DOES NOT match actual title: " + actualAbout );
        }

        driver.navigate().back();

        String expectedTitleHome = "Google";

        String actualHome = driver.getTitle();


        if (actualHome.contains(expectedTitleHome)) {
            System.out.println("Expected title: " + expectedTitleHome + " matches actual title: " + actualHome );
        } else {
            System.out.println("Expected title: " + expectedTitleHome + " DOES NOT match actual title: " + actualHome );
        }

        driver.quit();






    }


}
