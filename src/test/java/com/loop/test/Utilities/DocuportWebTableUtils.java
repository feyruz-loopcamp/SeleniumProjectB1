package com.loop.test.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.InputMismatchException;

public class DocuportWebTableUtils {


    public static String returnEmailAddress (WebDriver driver, String fullName){
        String xpath = "//td//span[contains(text(),'" + fullName + "')]/../../following-sibling::td[1]";
        WebElement emailAddress = driver.findElement(By.xpath(xpath));
        return emailAddress.getText();
    }

    public static String returnUserName (WebDriver driver, String fullName){
        String xpath = "//td//span[contains(text(),'" + fullName + "')]/../../following-sibling::td[2]";
        WebElement username = driver.findElement(By.xpath(xpath));
        return username.getText();
    }

    public static String returnAnyField (WebDriver driver, String emailAddress, String field){
        WebElement element = null;
        String xpath = "";
        switch (field.toLowerCase()) {
            case "full name":
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/preceding-sibling::td//span[2]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case "user name":
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/following-sibling::td[1]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case "phone number":
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/following-sibling::td[3]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case "role":
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/following-sibling::td[4]";
                element = driver.findElement(By.xpath(xpath));
                break;
            case "advisor":
                xpath = "//td[2][contains(text(),'" + emailAddress + "')]/following-sibling::td[5]";
                element = driver.findElement(By.xpath(xpath));
                break;
            default: throw new InputMismatchException("there is not such role: " + field);
        }
        return element.getText();
    }

}
