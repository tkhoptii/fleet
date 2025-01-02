package com.vytrack.step_definitions;

import com.vytrack.pages.US02_OroincDoc_TK_Page;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US02_OroincDoc_TK_StepDefs {

    US02_OroincDoc_TK_Page us02OroincDocTkPage = new US02_OroincDoc_TK_Page();

    @When("user clicks the question mark icon")
    public void user_clicks_the_question_mark_icon() {
        us02OroincDocTkPage.link_help.click();
    }

    @When("user switch to the {string}")
    public void user_switch_to_the(String title) {
        BrowserUtils.switchToWindow(title);
    }

    @Then("the user sees URL {string}")
    public void the_user_sees_url(String expectedURL) {
        BrowserUtils.verifyURLContains(expectedURL);
    }

}
