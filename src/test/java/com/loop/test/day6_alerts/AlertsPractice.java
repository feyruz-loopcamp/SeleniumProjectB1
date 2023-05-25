package com.loop.test.day6_alerts;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class AlertsPractice {

    /*
    Information alert practice
    1. Open browser
    2. Go to website: http://the-internet.herokuapp.com/javascript_alerts
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Verify “You successfully clicked an alert” text is displayed

    Confirmation alert practice
    1. Click to “Click for JS Confirm” button
    2. Click to OK button from the alert
    3. Verify “You clicked: Ok” text is displayed.



     */



    WebDriver driver;
    String actual;


    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void informationAlert() throws InterruptedException {
        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
        clickForJSAlert.click();
        Alert alert = driver.switchTo().alert();
       // driver.switchTo().alert().accept();
        Thread.sleep(3000);
        alert.accept();
        WebElement successMessageInformationAlert = driver.findElement(By.xpath("//p[contains(text(),'successfully')]"));
        actual = successMessageInformationAlert.getText();
        String expected = "You successfully clicked an alert";
        assertEquals(expected,actual);

    }

    @Test
    public void confirmnationAlert() throws InterruptedException {
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        clickForJSConfirm.click();
        Alert alert = driver.switchTo().alert();
        // driver.switchTo().alert().accept();
        Thread.sleep(3000);
        alert.accept();
        WebElement successMessageInformationAlert = driver.findElement(By.xpath("//p[contains(text(),'You clicked: Ok') or contains(text(),'You clicked: Cancel') or contains(text(),'You entered')]"));
        actual = successMessageInformationAlert.getText();
        String expected1 = "You clicked: Ok";
        assertEquals(expected1,actual);

        clickForJSConfirm.click();
        Thread.sleep(3000);
        alert.dismiss();
        actual = successMessageInformationAlert.getText();
        String expected2 = "You clicked: Cancel";
        assertEquals(expected2,actual);




    }

    @Test
    public void promptAlert() throws InterruptedException {
        WebElement clickForJSPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        clickForJSPrompt.click();
        Alert alert = driver.switchTo().alert();
        // driver.switchTo().alert().accept();
        Thread.sleep(3000);
        alert.sendKeys("Loop Academy");
        Thread.sleep(3000);
        alert.accept();
        WebElement successMessageInformationAlert = driver.findElement(By.xpath("//p[contains(text(),'You clicked: Ok') or contains(text(),'You clicked: Cancel') or contains(text(),'You entered')]"));
        actual = successMessageInformationAlert.getText();
        String expected3 = "Loop Academy";

        Assert.assertTrue(actual.contains(expected3));
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }



}
