package com.loop.test.day6_alerts;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T2_iframes extends TestBase {

    /*
    1- Open a chrome browser
    2- Go to: http://the-internet.herokuapp.com/iframe
    3- Clear text from comment body
    4- Type "Loop Academy" in comment body
    5- Verify "Loop Academy" text is written in comment body
    6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed

     */

    @Test
    public void iFarmeTest(){
        driver.get("http://the-internet.herokuapp.com/iframe");
        // id
        driver.switchTo().frame("mce_0_ifr");

        // index
        driver.switchTo().frame(0);

        //xpath / locator / element
        driver.switchTo().frame(driver.findElement(By.xpath("")));



        WebElement textBox = driver.findElement(By.xpath("//p"));
        textBox.clear();

        textBox.sendKeys("Loop Academy");

        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();







    }

}
