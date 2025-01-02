package com.vytrack.step_definitions;

import com.vytrack.pages.US14_manage_filters_on_Marketing_page_JZ_Page;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.List;


public class US14_manage_filters_on_Marketing_page_JZ_StepDefs {

    public US14_manage_filters_on_Marketing_page_JZ_Page us14ManageFiltersOnMarketingPageJzPage = new US14_manage_filters_on_Marketing_page_JZ_Page();


    @When("the user navigate to {string} and to {string} page,")
    public void the_user_navigate_to_and_to_page(String tab, String module) {
        us14ManageFiltersOnMarketingPageJzPage.navigateToModule("Marketing", "Campaigns");

    }

    @Then("user can see all checkboxes as checked by default")
    public void user_can_see_all_checkboxes_as_checked_by_default() {


        //Assert.assertTrue(us14ManageFiltersOnMarketingPageJzPage.CheckBoxList.);
        //for (WebElement each : us14ManageFiltersOnMarketingPageJzPage.CheckBoxList) {
        // Assert.assertTrue("Checkbox is not selected by default: " + each.getText(),each.isSelected());
        for (int i = 1; i <= 5; i++) {
            String element = "(//input[@name='multiselect_0'])[" + i + "]";
            BrowserUtils.sleep(3);
            //ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li//input[1]
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertTrue(filterCheckBoxes.isSelected());
            BrowserUtils.sleep(3);
        }
    }

    @And("user should wait {int} seconds")
    public void userShouldWaitSeconds(Integer seconds) {
        BrowserUtils.sleep(seconds);
    }

    @And("the user will click the filter message")
    public void theUserWillClickTheFilterMessage() {
        BrowserUtils.waitForPageToLoad(20);
        us14ManageFiltersOnMarketingPageJzPage.filterBtn.click();
    }

    @And("the user will click the manage filter")
    public void theUserWillClickTheManageFilter() {
        BrowserUtils.waitForPageToLoad(20);
        us14ManageFiltersOnMarketingPageJzPage.manageFilterBtn.click();
    }

    @Then("user is able to uncheck any amount of boxes")
    public void userIsAbleToUncheckAnyAmountOfBoxes() {

        us14ManageFiltersOnMarketingPageJzPage.filterOptionsCanBeUnselected();

    }
}