package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_SelectVehiclePage extends BasePage{

    public US07_SelectVehiclePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(xpath = "//input[@tabindex='-1']")
    public WebElement selectVehicleCheckBox;
}
