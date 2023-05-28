package com.loop.test.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.InputMismatchException;

public class DocuportUtilites {

    public static void loginDocuport(WebDriver driver, String role){
        driver.get("https://beta.docuport.app/");
        WebElement username = driver.findElement(By.xpath("//input[@id='input-14']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='input-15']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        switch (role.toLowerCase()){
            case "client":
                username.sendKeys(DocuportConstans.USERNAME_CLINET);
                password.sendKeys(DocuportConstans.PASSWORD);
                break;
            case "supervisor":
                username.sendKeys(DocuportConstans.USERNAME_SUPERVISOR);
                password.sendKeys(DocuportConstans.PASSWORD);
                break;
            case "advisor":
                username.sendKeys(DocuportConstans.USERNAME_ADVISOR);
                password.sendKeys(DocuportConstans.PASSWORD);
                break;
            case "employee":
                username.sendKeys(DocuportConstans.USERNAME_EMPLOYEE);
                password.sendKeys(DocuportConstans.PASSWORD);
                break;
            default:
                throw new InputMismatchException("There is not such a user: " + role);
        }
        loginButton.click();
    }

    public static void logOut(WebDriver driver){
        WebElement user = driver.findElement(By.xpath("//div[@class='v-avatar primary']"));
        user.click();
        WebElement logOut = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();


    }
}
