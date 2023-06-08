package com.loop.test.shorts;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetUpWebDriverManually {

    @Test
    public void driver_no_garcia(){
        System.setProperty("webdriver.chrome.driver", "/Users/nsh/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://loopcamp.io");
    }


}
