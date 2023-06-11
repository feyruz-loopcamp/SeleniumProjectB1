package com.loop.test.day_11;

import com.loop.test.Utilities.BrowserUtils;
import com.loop.test.Utilities.ConfigurationReader;
import com.loop.test.Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T00_scroll {

    /*
    1- Open a chrome browser
    2- Go to: https://loopcamp.vercel.app/infinite_scroll/index.html
    3- Use below JavaScript method and scroll
        a. 750 pixels down 10 times.
        b. 750 pixels up 10 times
        JavaScript method to use : window.scrollBy(0,0)
     */

    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
    }

    @Test
    public void scroll_test() throws InterruptedException{
        BrowserUtils.loopLinkClick("Infinite Scroll");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,750)");
        }
    }



}
