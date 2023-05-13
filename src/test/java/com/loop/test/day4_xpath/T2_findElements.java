package com.loop.test.day4_xpath;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_findElements {

    public static void main(String[] args) {

        /*
        1- Open a chrome browser
        2- Go to: https://www.nba.com
        3- Locate all the links in the page.
        4- Print out the number of the links on the page.
        5- Print out the texts of the links.
        6- Print out the HREF attribute values of the links

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://www.nba.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // old version
        //  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        List<WebElement> allLinksWithXpath = driver.findElements(By.xpath("//a"));

        System.out.println("allLinks = " + allLinks.size());

        System.out.println("allLinksXpath = " + allLinksWithXpath.size());

        for (WebElement linkText : allLinks) {
            if(!linkText.getText().equals("")) {
                System.out.println("linkText.getText() = " + linkText.getText());
                System.out.println("linkText.getAttribute(\"href\") = " + linkText.getAttribute("href"));
            }
        }

        System.out.println("=====================================================");

        for (int i = 0; i < allLinksWithXpath.size(); i++) {
            if (!allLinksWithXpath.get(i).getText().equals("")) {

                System.out.println("allLinksWithXpath.get(i).getText() = " + allLinksWithXpath.get(i).getText());
            }
        }
        }


    }

