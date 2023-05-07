package com.loop.test.day2_css_xpath;

import com.loop.test.Utilities.DocuportConstans;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * go tu docuport application
 * identify docuport logo with css
 * get value of the attribute
 * Validate if  it is "Docuport"
 */

public class T3_getAttribute_css {

    public static void main(String[] args) {
        // go to url
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        // enter username
        WebElement userName = driver.findElement(By.cssSelector("input[id='input-14']"));
        userName.sendKeys(DocuportConstans.USERNAME_ADMIN);

        WebElement passWord = driver.findElement(By.cssSelector("input[type='password']"));
        passWord.sendKeys(DocuportConstans.USERNAME_ADMIN);


        WebElement docuport = driver.findElement(By.cssSelector("img[alt='Docuport']"));
        System.out.println(docuport.getAttribute("alt"));
    }


}
