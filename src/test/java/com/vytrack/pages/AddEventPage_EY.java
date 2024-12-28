package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEventPage_EY extends BasePage{

    public AddEventPage_EY() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement checkBox;

    @FindBy(css = ".recurrence-subview-control__number")
    public WebElement repeatEveryXday;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarBtn;

//
//    @FindBy(id = "prependedInput")
//    public WebElement usernameInput;
//
//    @FindBy(id = "prependedInput2")
//    public WebElement passwordInput;
//
//    @FindBy(id = "_submit")
//    public WebElement loginBtn;
//
//    public void login(String username, String password){
//        usernameInput.sendKeys(ConfigurationReader.getProperty(username));
//        passwordInput.sendKeys(ConfigurationReader.getProperty(password));
//        loginBtn.click();
//    }
}
