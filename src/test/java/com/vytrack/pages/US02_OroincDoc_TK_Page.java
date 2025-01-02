package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US02_OroincDoc_TK_Page extends BasePage {


    @FindBy(xpath = "//a[@class=\"help no-hash\"]")
    public WebElement link_help;
}
