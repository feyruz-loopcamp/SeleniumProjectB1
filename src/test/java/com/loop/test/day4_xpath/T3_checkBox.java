package com.loop.test.day4_xpath;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_checkBox {

    public static void main(String[] args) {

        /*
        1. Go to http://the-internet.herokuapp.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement checkBox1 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(., 'checkbox 1')]/preceding-sibling::input"));
        checkBox1.click();
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

        WebElement checkBox2 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(., 'checkbox 1')]/preceding-sibling::input"));
        checkBox2.click();
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());


    }
}
