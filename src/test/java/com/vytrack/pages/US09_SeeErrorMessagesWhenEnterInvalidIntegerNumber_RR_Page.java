package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US09_SeeErrorMessagesWhenEnterInvalidIntegerNumber_RR_Page {

    public US09_SeeErrorMessagesWhenEnterInvalidIntegerNumber_RR_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



//    @FindBy(xpath = "//input[@name='temp-validation-name-1290']")
    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEverySpace;

    @FindBy(xpath = "(//span[.='The value have not to be less than 1.'])[3]")
    public WebElement errorMessageLess;

    @FindBy(xpath = "(//span[.='The value have not to be more than 99.'])[3]")
    public WebElement errorMessageMore;



}
