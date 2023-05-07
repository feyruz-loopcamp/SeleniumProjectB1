package com.loop.test.day2_css_xpath;

import com.loop.test.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_css_xpath_isDisplayed {

    /* go to http://the-internet.herokuapp.com/forgot_password
     *  locate 5 elements, forgot password, email, email input, retrieve password, powered selenium
     *  xpath or css
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");










    }

}
