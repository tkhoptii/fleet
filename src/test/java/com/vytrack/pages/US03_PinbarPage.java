package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US03_PinbarPage {

    public US03_PinbarPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement PinbarLink;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement UsePinbar;

    @FindBy(xpath = "//button[@class='btn minimize-button']")
    public WebElement PinIcon;


}
