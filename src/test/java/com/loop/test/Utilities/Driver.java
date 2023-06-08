package com.loop.test.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

     /*
     Creating the private constructor so this class' object
     is not reachable from outside
      */
    private Driver(){
    }

    /*
    Making 'driver' instance private
    Static -  run before everything else, and also usable in a static method
     */
   // private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>(); // we will learn in future
    private static WebDriver driver;

    /*
    re-usable utility method that will return same 'driver' instance everytime when called it
     */

    /**
     *
     * @return driver
     * @author nsh
     */
    public static WebDriver getDriver(){
        if(driver==null){
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser type: " + browserType );
            }
            driver.manage().window().maximize();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }














}
