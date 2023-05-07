package com.loop.test.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

    /*
     * create a static method getDriver
     * Accepts argument String - browser type
     * returns webdriver
     */

    /**
     *
     * @param browserType
     * @return browser type
     */
    public static WebDriver getDriver (String browserType) {
        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if(browserType.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        } else {
            System.out.println("No driver found");
            return null;
        }

    }


}
