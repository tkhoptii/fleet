package com.vytrack.step_definitions;

import com.vytrack.pages.US04_VehicleContractsPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US04_VehicleContracts_StepDefs {

    US04_VehicleContractsPage us04_vehicleContractsPage = new US04_VehicleContractsPage();
    @When("the user should see the page URL as {string}")
    public void the_user_should_see_the_page_url_as(String tap, String module) {
        us04_vehicleContractsPage.navigateToModule("Fleet", "Vehicle Contracts");

    }
    @When("the user should see expected title as {string}")
    public void the_user_should_see_expected_title_as(String string) {
        String expectedURL = "https://qa1.vytrack.com";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedURL);

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Then("the user should see the error message {string}")
    public void the_user_should_see_the_error_message(String string) {

        String expectedErrorMessage = "You do not have permission to perform this action.";
        String actualErrorMessage = us04_vehicleContractsPage.ErrorMessage.getText();
        Assert.assertTrue(us04_vehicleContractsPage.ErrorMessage.isDisplayed());
        Assert.assertEquals("Error message text does not match", actualErrorMessage,expectedErrorMessage);
    }



}
