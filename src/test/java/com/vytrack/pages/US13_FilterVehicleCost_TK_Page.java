package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US13_FilterVehicleCost_TK_Page extends BasePage {

   @FindBy(xpath = "//a[@class='grid-header-cell__link']")
 public List<WebElement> expectedModules;


   @FindBy(xpath = "(//table//input[@type='checkbox'])[1]")
    public WebElement selectAllCheckbox;
}
