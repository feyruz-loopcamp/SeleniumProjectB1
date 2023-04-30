package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooleSearch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));

        String textToSearch = "Loop Academy";

        searchBox.sendKeys(textToSearch + Keys.ENTER);

        String expectedTitle = "Loop Academy";

        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Expected title: " + expectedTitle + ", matches actual title: " + actualTitle );
        } else {
            System.out.println("Expected title: " + expectedTitle + ", DOES NOT match actual title: " + actualTitle );
        }



    }

}
