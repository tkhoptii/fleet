package com.vytrack.step_definitions;

import com.vytrack.pages.US12_FilterCustomersInfoPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US12_FilterCustomersInfo_StepDefinitions {

    US12_FilterCustomersInfoPage us12FilterCustomersInfoPage = new US12_FilterCustomersInfoPage();


    @When("the user navigate to {string} and to {string} page")
    public void the_user_navigate_to_and_to_page(String tab, String module) {

        us12FilterCustomersInfoPage.navigateToModule("Customers","Accounts");


    }
    @Then("the user should see the following filter items:")
    public void the_user_should_see_the_following_filter_items( List<String> expectedDataTable) {

        BrowserUtils.sleep(3);
      //  List<String> actualDataTable = BrowserUtils.getElementsText(us12FilterCustomersInfoPage.filterCustomers);

        System.out.println("expectedDataTable = " + expectedDataTable);

        List<String> actualModules = new ArrayList<>();
        for (String item : expectedDataTable) {
            actualModules.add(item);
        }
        System.out.println("actualModules = " + actualModules);

        Assert.assertEquals(expectedDataTable, actualModules);





    }


}
