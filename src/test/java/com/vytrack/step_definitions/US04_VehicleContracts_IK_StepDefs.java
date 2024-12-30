package com.vytrack.step_definitions;

import com.vytrack.pages.US04_VehicleContracts_IKPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04_VehicleContracts_IK_StepDefs {

    US04_VehicleContracts_IKPage us04_vehicleContractsPage = new US04_VehicleContracts_IKPage();

    @When("the user should see expected title as {string}")
    public void the_user_should_see_expected_title_as(String expectedTitle) {

        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.sleep(1);
         Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Then("the user should see the error message {string}")
    public void the_user_should_see_the_error_message(String string) {

        String expectedErrorMessage = "You do not have permission to perform this action.";
        String actualErrorMessage = us04_vehicleContractsPage.ErrorMessage.getText();
        Assert.assertTrue(us04_vehicleContractsPage.ErrorMessage.isDisplayed());

    }


    @And("the user should see the page URL as {string}")
    public void theUserShouldSeeThePageURLAs(String expectedURL) {

        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURL,actualURL);

    }
}
