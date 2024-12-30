package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_AddEventPage_EY extends BasePage {

    public US08_AddEventPage_EY() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEveryXday;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarBtn;

    @FindBy(xpath = "//span[contains(text(), 'This value should not be blank.')]")
    public WebElement errorMessage;

}
