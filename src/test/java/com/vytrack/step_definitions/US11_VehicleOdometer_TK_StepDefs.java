package com.vytrack.step_definitions;

import com.vytrack.pages.US11_VehicleOdometer_TK_Page;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US11_VehicleOdometer_TK_StepDefs {

    US11_VehicleOdometer_TK_Page us11VehicleOdometerPage = new US11_VehicleOdometer_TK_Page();


    @When("the user navigate to {string} and to {string} page")
    public void the_user_navigate_to_and_to_page(String tab, String module) {
        BrowserUtils.waitFor(3);
        us11VehicleOdometerPage.navigateToModule("Fleet", "Vehicle Odometer");
        BrowserUtils.waitFor(2);
    }

    @Then("user should see the error message {string}")
    public void user_should_see_the_error_message(String expectedErrorMessage) {
        Assert.assertTrue(us11VehicleOdometerPage.errorMessage.isDisplayed());
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForVisibility(By.xpath("//div[@class='alert alert-error fade in top-messages '][1]"), 3);
        System.out.println("us11VehicleOdometerPage.errorMessage.getText() = " + us11VehicleOdometerPage.errorMessage.getText());
        //Assert.assertEquals(expectedErrorMessage, us11VehicleOdometerPage.errorMessage.getText());

    }
}

