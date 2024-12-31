package com.vytrack.pages;

import com.vytrack.step_definitions.US01_Dashboard_TK_StepDefs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US01_DashboardPage_TK_Page extends BasePage {


    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;
}
