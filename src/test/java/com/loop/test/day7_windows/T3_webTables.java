package com.loop.test.day7_windows;

import com.loop.test.Utilities.DocuportUtilites;
import com.loop.test.Utilities.DocuportWebTableUtils;
import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_webTables extends TestBase {

    @Test
    public void webtables_docuport(){
        DocuportUtilites.loginDocuport(driver, "advisor");
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        System.out.println(DocuportWebTableUtils.returnAnyField(driver, "b1g2_supervisor@gmail.com", "role"));

    }
}
