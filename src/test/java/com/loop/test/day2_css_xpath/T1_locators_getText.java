package com.loop.test.day2_css_xpath;

import com.loop.test.Utilities.DocuportConstans;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

        /*
         * go to docuport appliaction
         * enter username
         * do NOT enter password
         * click on login button
         * verify error message - please enter password
         */

        // go to url
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        // enter username
        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstans.USERNAME_ADMIN);

        // click login button
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();


        // identify the error message gor password
        WebElement errorMessageForPassword = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessageFor =  errorMessageForPassword.getText();


        if (actualErrorMessageFor.equals(DocuportConstans.EXPECTED_ERROR_MESSAGE_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstans.EXPECTED_ERROR_MESSAGE_PASSWORD + ", matches actual error message: " + actualErrorMessageFor + ". Test PASSED");
        } else {
            System.out.println("Expected error message: " + DocuportConstans.EXPECTED_ERROR_MESSAGE_PASSWORD + ", DOES NOT match actual error message: " + actualErrorMessageFor + ". Test FAILED");
        }

    driver.quit();



    }

}
