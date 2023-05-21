package com.loop.test.testNG_dropdown;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class T3_multiple_dropdown {

    /*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.

     */


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void colorTest() throws InterruptedException {

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        Assert.assertTrue(dropdown.isMultiple());

        List<WebElement> options = new ArrayList<>();
        options = dropdown.getOptions();

        dropdown.selectByValue("volvo");
        Thread.sleep(3000);
        dropdown.selectByIndex(1);
        Thread.sleep(3000);
        dropdown.selectByVisibleText("Opel");
        Thread.sleep(3000);


//        for (WebElement each : options) {
//            each.click();
//            System.out.println(each.getText());
//        }




    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
