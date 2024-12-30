package com.vytrack.step_definitions;

import com.vytrack.pages.US05_VehicleModelPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;


public class US05_VehicleModelPage_StepDefs {

    US05_VehicleModelPage us05_vehicleModelPage = new US05_VehicleModelPage();

    @When("the user navigate to {string} and to {string} page")
    public void theUserNavigateToAndToPage(String tab, String module) {
        us05_vehicleModelPage.navigateToModule("Fleet","Vehicles Model");

    }
    @Then("user should be able to see following modules")
   public void user_should_be_able_to_see_following_modules(List<String> expectedModels) {
    BrowserUtils.sleep(3);
    List<String> actualModels = BrowserUtils.getElementsText(us05_vehicleModelPage.allModels);
      BrowserUtils.sleep(3);
       //Assert.assertEquals(expectedModels,actualModels);
      //Assert.assertTrue(actualModels.contains(expectedModels));

        Assert.assertTrue(actualModels.containsAll(expectedModels));

    }



  // @Then("user should be able to see following modules:")
   //public void userShouldBeAbleToSeeFollowingModules() {
   //}

   //@When("the user navigate to {string} and to {string} page")
   // public void theUserNavigateToAndToPage(String tab, String module) {
   //    us05_vehicleModelPage.navigateToModule("Fleet","Vehicles Model");
   }
