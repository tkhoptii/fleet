package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US04_VehicleContracts_IKPage extends BasePage {

    public US04_VehicleContracts_IKPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages '][2]")
    public WebElement ErrorMessage;


}
