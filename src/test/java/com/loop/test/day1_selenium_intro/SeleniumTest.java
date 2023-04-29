package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // setting bu web driver
        WebDriverManager.chromedriver().setup();

        // create instance of driver
        WebDriver driver = new ChromeDriver();


        driver.get("https://beta.docuport.app/");





    }
}
