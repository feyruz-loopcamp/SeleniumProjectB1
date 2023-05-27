package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class T1_windowHandle extends TestBase {

    /*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”

     */

    @Test
    public void windowHandle(){
        driver.get("http://the-internet.herokuapp.com/windows");
        assertTrue(driver.getTitle().contains("The Internet"));

        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click')]"));
        clickHere.click();

        Set<String > windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            driver.switchTo().window(each);
        }

    }

}
