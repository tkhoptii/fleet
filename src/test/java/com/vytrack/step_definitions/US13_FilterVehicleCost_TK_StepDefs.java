package com.vytrack.step_definitions;

import com.vytrack.pages.US13_FilterVehicleCost_TK_Page;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US13_FilterVehicleCost_TK_StepDefs {

    public US13_FilterVehicleCost_TK_Page us13FilterVehicleCostTkPage = new US13_FilterVehicleCost_TK_Page();

    @When("user navigate to {string} and to {string} page,")
    public void user_navigate_to_and_to_page(String tab, String module) {
        us13FilterVehicleCostTkPage.navigateToModule("Fleet", "Vehicle Costs");
    }

    @Then("user should be able to see the following modules")
    public void userShouldBeAbleToSeeTheFollowingModules(List<String> expectedModulesText) {
    us13FilterVehicleCostTkPage.waitUntilLoaderScreenDisappear();
    BrowserUtils.sleep(3);
        List<String> actualModules = BrowserUtils.getElementsText(us13FilterVehicleCostTkPage.expectedModules);
        System.out.println("actualModules = " + actualModules);
        System.out.println("expectedModulesText = " + expectedModulesText);
        BrowserUtils.waitFor(3);
        Assert.assertTrue(actualModules.containsAll(expectedModulesText));
    }

    @Then("user can check first checkbox to select all vehicle cost")
    public void userCanCheckFirstCheckboxToSelectAllVehicleCost() {
        us13FilterVehicleCostTkPage.selectAllCheckbox.click();
        Assert.assertTrue(us13FilterVehicleCostTkPage.selectAllCheckbox.isSelected());
    }
}
