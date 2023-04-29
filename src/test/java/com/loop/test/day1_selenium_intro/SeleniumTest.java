package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        // setting bu web driver
        WebDriverManager.chromedriver().setup();

        // create instance of driver
        WebDriver driver = new ChromeDriver();


       driver.get("https://www.etsy.com/");

        // navigate to - it allows back and forth
        driver.navigate().to("https://www.etsy.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();

        // title methods

        String myWebtitle = driver.getTitle();
        System.out.println("myWebtitle = " + myWebtitle);


    }
}
