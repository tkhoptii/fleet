package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US14_manage_filters_on_Marketing_page_JZ_Page extends BasePage {

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterBtn;
    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilterBtn;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']")

    public List<WebElement> CheckBoxList;

    public void filterOptionsCanBeUnselected() {
        for (int i = 1; i <= 5; i++) {
            String element = "(//input[starts-with(@name,'multiselect')])[" + i + "]";
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            filterCheckBoxes.click();
            BrowserUtils.sleep(1);
            filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));//not to get stale element reference exception
            Assert.assertFalse(filterCheckBoxes.isSelected());
        }


    }
}

