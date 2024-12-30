package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_VehicleOdometer_TK_Page extends BasePage {

    public US11_VehicleOdometer_TK_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages '][1]")
    public WebElement errorMessage;
}
