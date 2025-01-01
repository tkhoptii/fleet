package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_VehicleOdometer_TK_Page extends BasePage {

    public US11_VehicleOdometer_TK_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement tabFleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[4]")
    public WebElement moduleVehicleOdometer;

    @FindBy(xpath = "//div[@class='flash-messages-holder']")
    public WebElement errorMessage;


    @FindBy(xpath = "//input[@class='input-widget']")
    public WebElement defaultPageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPage;
}
