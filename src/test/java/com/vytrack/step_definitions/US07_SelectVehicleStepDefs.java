package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.US07_SelectVehiclePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US07_SelectVehicleStepDefs  {

    US07_SelectVehiclePage us07SelectVehiclePage = new US07_SelectVehiclePage();

    @Given("user navigate to {string} and to {string} page")
    public void user_navigate_to_and_to_page(String tab, String module) {
    us07SelectVehiclePage.navigateToModule("Fleet", "Vehicles");
    }

    @Then("user can see all checkboxes as unchecked")
    public void user_can_see_all_checkboxes_as_unchecked() {

    }

    @Then("user can check first checkbox to select all the cars")
    public void user_can_check_first_checkbox_to_select_all_the_cars() {

    }


}
