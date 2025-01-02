package com.vytrack.step_definitions;

import com.vytrack.pages.US11_VehicleOdometer_TK_Page;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US11_VehicleOdometer_TK_StepDefs {

    US11_VehicleOdometer_TK_Page us11VehicleOdometerPage = new US11_VehicleOdometer_TK_Page();

    @When("both users navigate to {string} and to {string} page")
    public void bothUsersNavigateToAndToPage(String tab, String module) {
        BrowserUtils.waitFor(5);
        us11VehicleOdometerPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForTitleContains("Dashboard");
        us11VehicleOdometerPage.navigateToModule("Fleet", "Vehicle Odometer");
        us11VehicleOdometerPage.waitUntilLoaderScreenDisappear();
    }

    @Then("both users should see the error message {string}")
    public void bothUsersShouldSeeTheErrorMessage(String expectedErrorMessage) {
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForVisibility(By.xpath("//div[@class='flash-messages-holder']"), 3);
        BrowserUtils.verifyElementDisplayed(By.xpath("//div[@class='flash-messages-holder']"));
        System.out.println("us11VehicleOdometerPage.errorMessage.getText() = " + us11VehicleOdometerPage.errorMessage.getText());
        Assert.assertTrue(us11VehicleOdometerPage.errorMessage.isDisplayed());
        Assert.assertTrue(us11VehicleOdometerPage.errorMessage.getText().contains(expectedErrorMessage));
    }

    @When("user navigate to {string} and to {string} page.")
    public void userNavigateToAndToPage(String tab, String module) {
        BrowserUtils.waitFor(5);
        us11VehicleOdometerPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForTitleContains("Dashboard");
        us11VehicleOdometerPage.navigateToModule("Fleet", "Vehicle Odometer");
        us11VehicleOdometerPage.waitUntilLoaderScreenDisappear();

    }

    @Then("user should see default page as {string}")
    public void userShouldSeeDefaultPageAs(String defaultPage) {
        BrowserUtils.waitFor(3);
        System.out.println("us11VehicleOdometerPage.defaultPageNumber.getAttribute(\"value\") = " + us11VehicleOdometerPage.defaultPageNumber.getAttribute("value"));
    }

    @And("drivers see the View Per Page as {string} by default")
    public void driversSeeTheViewPerPageAsByDefault(String viewPerPageDefault) {
        System.out.println("us11VehicleOdometerPage.viewPerPage.getText() = " + us11VehicleOdometerPage.viewPerPage.getText());
        Assert.assertEquals(viewPerPageDefault, us11VehicleOdometerPage.viewPerPage.getText());
    }
}

