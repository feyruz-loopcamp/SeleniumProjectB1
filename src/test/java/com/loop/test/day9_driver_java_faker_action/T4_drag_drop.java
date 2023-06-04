package com.loop.test.day9_driver_java_faker_action;

import com.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_drag_drop {
    /*
    1- Open a chrome browser
    2- Go to: https://demo.guru99.com/test/drag_drop.html
    3- Drag “BANK” and drop into Account area under Debit Side
    4- Drag “5000” and drop into Amount area under Debit Side
    5- Drag “SALES” and drop into Account area under Credit Side
    6- Drag “5000” and drop into Amount area under Credit Side
    7- Verify “Perfect!” text displayed.
     */

    @Test
    public void drag_drop(){

        Driver.getDriver().get("https://demo.guru99.com/test/drag_drop.html");
        WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));

        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(bank, debitAccount).perform();

        WebElement fiveThousand = Driver.getDriver().findElement(By.linkText("5000"));
        WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));
        action.dragAndDrop(fiveThousand, debitAmount).perform();

        WebElement sales = Driver.getDriver().findElement(By.linkText("SALES"));
        WebElement creditAmount = Driver.getDriver().findElement(By.id("loan"));
        action.dragAndDrop(sales, creditAmount).perform();


    }

}


