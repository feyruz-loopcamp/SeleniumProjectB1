package com.loop.test.day7_windows;

import com.loop.test.Utilities.BrowserUtils;
import com.loop.test.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class T2_windows_handle extends TestBase {

    /*
    1. Create new test and make set ups
    2. Go to : https://www.amazon.com
    3. Copy paste the lines from below into your class
    4. Create a logic to switch to the tab where Etsy.com is open
    5. Assert: Title contains “Etsy”
    Lines to be pasted:
    ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    These lines will simply open new tabs using something called JavascriptExecutor
    and get those pages. We will learn JavascriptExecutor later as well.

     */

    @Test
    public void windowsHandleTest(){
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

//        Set<String> windowHandles = driver.getWindowHandles();
//
//        for (String window : windowHandles){
//            driver.switchTo().window(window);
//            System.out.println(driver.getCurrentUrl());
//            if (driver.getCurrentUrl().toLowerCase().contains("etsy")){
//
//                break;
//            }
//        }
//
//        assertTrue(driver.getTitle().toLowerCase().contains("etsy"));

       // BrowserUtils.switchWindowAndVerify(driver, "amazon.com", "amazon");
        BrowserUtils.switchToWindow(driver, "Facebook");

    }







}
