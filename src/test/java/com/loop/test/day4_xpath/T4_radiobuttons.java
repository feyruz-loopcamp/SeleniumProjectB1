package com.loop.test.day4_xpath;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T4_radiobuttons {

    public static void main(String[] args) {

        /*
        https://demoqa.com/radio-button
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement radioYes = driver.findElement(By.xpath("//input[@id='yesRadio']"));

        WebElement radioNo = driver.findElement(By.xpath("//input[@id='noRadio']"));

        System.out.println("radioNo.isSelected() = " + radioNo.isSelected());


        List <WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("radios.size() = " + radios.size());
    }
}
