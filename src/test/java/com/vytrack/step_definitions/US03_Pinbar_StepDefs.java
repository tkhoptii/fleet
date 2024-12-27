package com.vytrack.step_definitions;

import com.vytrack.pages.US03_PinbarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_Pinbar_StepDefs {

    US03_PinbarPage us03_pinbarPage = new US03_PinbarPage();

    @When("the user clicks to the {string}")
    public void the_user_clicks_to_the(String string) {

        us03_pinbarPage.PinbarLink.click();

    }
    @When("the user see “How To Use Pinbar”")
    public void the_user_see_how_to_use_pinbar() {

        String expectedTitle = "How To Use Pinbar";
        String actualTitle = us03_pinbarPage.UsePinbar.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("the user can see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”")
    public void the_user_can_see_use_the_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {

        Assert.assertTrue("Button not displayed",us03_pinbarPage.PinIcon.isDisplayed());


    }
}
