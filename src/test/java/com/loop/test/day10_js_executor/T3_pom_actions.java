package com.loop.test.day10_js_executor;

import com.loop.pages.LoopPractice;
import com.loop.test.Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_pom_actions {


    /*
    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Verify expected default text appears on big circle
    Expected = "Drag the small circle here."

    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Verify "Drop here." text appears on big circle

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Move it on top of the big circle
    5. Verify “Now drop…” text appears on big circ

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Dropped anywhere outside of big circle
    5. Verify “Try again!” text appears on big circle
     */


    /*

    @Test
    public void drag_small_circle(){
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        Actions actions = new Actions(Driver.getDriver());
        LoopPractice page = new LoopPractice();
        Assert.assertEquals(page.bigCircle.getText(), "Drag the small circle here.");
    }

    @Test
    public void drop_here(){
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        Actions actions = new Actions(Driver.getDriver());
        LoopPractice page = new LoopPractice();
        actions.moveToElement(page.smallcircile).clickAndHold().moveByOffset(1000,0).pause(3000).perform();
        Assert.assertEquals(page.bigCircle.getText(), "Drop here.");

    }

     */

    LoopPractice page;
    Actions actions;

    @BeforeMethod
    public void setUp() {
        page = new LoopPractice();
        actions = new Actions(Driver.getDriver());
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
    }

    @Test
    public void drag_small_circle() {
        Assert.assertEquals(page.bigCircle.getText(), "Drag the small circle here.");
    }

    @Test
    public void drop_here() {
        actions.moveToElement(page.smallcircile).clickAndHold().moveByOffset(1000, 0).pause(3000).perform();
        Assert.assertEquals(page.bigCircle.getText(), "Drop here.");

    }

    @AfterClass
    public void tearDown(){
        Driver.getDriver().quit();
    }


}

















