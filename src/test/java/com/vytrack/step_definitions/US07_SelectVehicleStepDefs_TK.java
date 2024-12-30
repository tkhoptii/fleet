package com.vytrack.step_definitions;

import com.vytrack.pages.US07_SelectVehiclePage_TK;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Random;


public class US07_SelectVehicleStepDefs_TK {

    US07_SelectVehiclePage_TK us07SelectVehiclePage = new US07_SelectVehiclePage_TK();

    @When("user navigate to {string} and to {string} page")
    public void user_navigate_to_and_to_page(String tab, String module) {
        us07SelectVehiclePage.navigateToModule("Fleet", "Vehicles");
    }

    @Then("user can see all checkboxes as unchecked")
    public void user_can_see_all_checkboxes_as_unchecked() {
        for(WebElement each : us07SelectVehiclePage.selectAnyVehicleCheckBox){
           Assert.assertTrue(!each.isSelected());
        }
   }

    @Then("user can check first checkbox to select all the cars")
    public void user_can_check_first_checkbox_to_select_all_the_cars() {
        us07SelectVehiclePage.selectAllVehicleCheckBox.click();
        Assert.assertTrue(us07SelectVehiclePage.selectAllVehicleCheckBox.isSelected());
    }


    @Then("user can select any car")
    public void userCanSelectAnyCar() {
        Random random = new Random();
        int randomIndex = random.nextInt(us07SelectVehiclePage.selectAnyVehicleCheckBox.size());
        WebElement randomCheckBox = us07SelectVehiclePage.selectAnyVehicleCheckBox.get(randomIndex);
        BrowserUtils.waitFor(2);
        randomCheckBox.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(randomCheckBox.isSelected());

        //done
    }
}
