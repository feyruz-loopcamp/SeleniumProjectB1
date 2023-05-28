package com.loop.test.Utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class BrowserUtils {


    /**
     * @param driver
     * @param expectedUrl, it uses contains method
     * @param expectedUrl, it uses contains method
     * @return void, assertion is implemented
     * @author nadir
     */
    public static void switchWindowAndVerify(WebDriver driver, String expectedUrl, String expectedTitle){
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles){
            driver.switchTo().window(window);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }
        }
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    /**
     * @param driver
     * @param expectedTitle
     * returns void, assertion is implemented
     * @authot nadir
     */
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        assertTrue(driver.getTitle().contains(expectedTitle));
    }

    /**
     * switches to new window by the exact title
     * returns to original window if windows with given title not found
     */
    public static void switchToWindow(WebDriver driver, String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)) {
                return;
            }
        }
        driver.switchTo().window(origin);
    }




}
