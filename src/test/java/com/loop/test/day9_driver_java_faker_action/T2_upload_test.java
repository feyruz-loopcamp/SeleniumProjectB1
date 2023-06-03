package com.loop.test.day9_driver_java_faker_action;

import com.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T2_upload_test {

    /*
    1. Go to “http://demo.guru99.com/test/upload”
    2. Upload file into Choose File
    3. Click terms of servide check box
    4. Click Submit File button
    5. Verify expected message appeared. Expected: “1 file has been successfully uploaded.
     */


    @Test
    public void upload_file() throws InterruptedException {

        Driver.getDriver().get("http://demo.guru99.com/test/upload");

        WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));

        String path = "/Users/nsh/Desktop/some-file.txt";

        chooseFile.sendKeys(path);

        WebElement terms = Driver.getDriver().findElement(By.id("terms"));

        terms.click();

        WebElement submitButton = Driver.getDriver().findElement(By.id("submitbutton"));

        submitButton.click();

        WebElement successMessage = Driver.getDriver().findElement(By.id("res"));

        String expected = "1 file\nhas been successfully uploaded.";

        Thread.sleep(3000);

        assertEquals(successMessage.getText(), expected);



    }
}
