package com.loop.test.day7_windows;

import com.loop.test.Utilities.DocuportUtilites;
import com.loop.test.Utilities.DocuportWebTableUtils;
import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_webTables extends TestBase {


    /*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */

    @Test
    public void webtables_docuport(){
        DocuportUtilites.loginDocuport(driver, "advisor");
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        assertEquals(DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail", "full name"), "Alex De Souza");
        assertEquals(DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail", "user name"), "alexdesouze");
        assertEquals(DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail", "phone number"), "+994512060042");
        assertEquals(DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail", "role"), "Client");
        assertEquals(DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail", "advisor"), "Batch1 Group1");





    }
}
