package com.loop.test.day10_js_executor;

import com.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class T2_drag_and_drop {

    /*
    TC #1: Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Move it on top of the big circle
    5. And release on it.
    6. Verify “You did great!” text appears on big circle
     */


    @Test
    public void practice_drag_drop(){
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        // actions.dragAndDrop(smallCircle, bigCircle).perform();

        actions.moveToElement(smallCircle)
                .clickAndHold()
                .moveToElement(bigCircle)
                .release()
                .perform();

        WebElement great = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'great')]"));
        String actual = great.getText();
        String expected = "You did great!";
        assertEquals(actual, expected);
        assertTrue(great.isDisplayed());

    }
}
