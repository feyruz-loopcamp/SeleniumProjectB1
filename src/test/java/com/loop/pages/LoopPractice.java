package com.loop.pages;


import com.loop.test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPractice {

    @FindBy(id="draggable")
    public WebElement smallcircile;

    @FindBy(id="droptarget")
    public WebElement bigCircle;

    public LoopPractice(){
        PageFactory.initElements(Driver.getDriver(),  this);
    }


}
