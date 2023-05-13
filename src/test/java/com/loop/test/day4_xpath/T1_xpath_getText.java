package com.loop.test.day4_xpath;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_getText {

    /*
    1. Open Chrome browser
    2. Go to docuport
    3. Click on forgot password
    4. validate URL contains: reset-password
    5. validate - Enter the email address associated with your account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate cancel button is displayed
    8. validate send button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/login");

        WebElement forgotPassword = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgotPassword.click();
        WebElement emailBoxMessage = driver.findElement(By.xpath("//div[contains(text(),'account')]"));
        emailBoxMessage.isDisplayed();
        System.out.println(emailBoxMessage.getText());





    }
}
