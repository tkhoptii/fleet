package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US07_SelectVehiclePage_TK extends BasePage {

    public US07_SelectVehiclePage_TK() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> selectAnyVehicleCheckBox;

    @FindBy(xpath = "//th[contains(@class, 'select-all-header-cell')]//input")
    public WebElement selectAllVehicleCheckBox;


}
