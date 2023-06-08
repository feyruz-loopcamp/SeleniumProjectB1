package com.loop.pages;

import com.loop.test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDynamicLoading {

    public LoopPracticeDynamicLoading() {
        PageFactory.initElements(Driver.getDriver(),  this);
    }

    @FindBy(xpath="(//*[contains(text(),'Done!')])[2]")
    public WebElement doneMessage;


    @FindBy(xpath="//img[@src='/img/a-few-moments.jpg']")
    public WebElement image;



}
