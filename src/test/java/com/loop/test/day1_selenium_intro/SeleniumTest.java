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

        // maximize
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();



       driver.get("https://www.etsy.com/");

        // navigate to - it allows back and forth
        driver.navigate().to("https://www.etsy.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();

        // title methods

        String currentTitle = driver.getTitle();
        System.out.println("myWebtitle = " + currentTitle);

        // lets navigate to amazon
        driver.get("https://amazon.com");

        currentTitle = driver.getTitle();
        System.out.println("myWebtitle = " + currentTitle);

        // get the url of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // close browser - current open one
       driver.close();

       // quit driver
        driver.quit();



    }
}
