package com.vytrack.step_definitions;


//import com.vytrack.pages.AddEventPage;

import com.vytrack.pages.AddEventPage_EY;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Add_Event_Step_Definitions_EY {


//    @Given("I am on the calendar event creation page")
//    public void i_am_on_the_calendar_event_creation_page() {
//        //Driver.getDriver().get("https://qa1.vytrack.com/calendar/event/create"); // Hooks handles the access to this page

    //    }


    AddEventPage_EY addEventPageEy = new AddEventPage_EY();


    @Given("users navigate to {string} and to {string} page")
    public void usersNavigateToAndToPage(String tab, String module) {
        addEventPageEy.navigateToModule("Activities", "Calendar Events");
    }

    @When("users create calendar even click create calendar event button")
    public void usersCreateCalendarEvenClickCreateCalendarEventButton() {
        BrowserUtils.sleep(2);
        addEventPageEy.createCalendarBtn.click();
    }

    @When("users choose to create a recurring event to click repeat checkbox")
    public void i_choose_to_create_a_recurring_event() {
        addEventPageEy.checkBox.click();
        Assert.assertTrue("Checkbox is selected", addEventPageEy.checkBox.isSelected());

    }

    @And("users confirm Repeat Every is set to 1 as default")
    public void iConfirmIsSetToAsDefault() {
        String repeatValue = addEventPageEy.repeatEveryXday.getAttribute("value");
        System.out.println("addEventPageEy.repeatEveryXday = " + repeatValue);
    }

    @Then("users should see {string} by default in the Repeat Every input field")
    public void i_should_see_by_default_in_the_input_field(String expectedValue) {
        String actualValue = addEventPageEy.repeatEveryXday.getAttribute("value");
        Assert.assertEquals("This is not the value!!", actualValue, expectedValue);
        BrowserUtils.sleep(2);
    }


    @When("I clear the Repeat Every field")
    public void iClearTheRepeatEveryField() {

        WebElement clearTheBox = addEventPageEy.repeatEveryXday;
        clearTheBox.click();
        while (!clearTheBox.getAttribute("value").isEmpty()) {
            clearTheBox.sendKeys(Keys.BACK_SPACE);

        }
        clearTheBox.sendKeys(Keys.TAB);
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String expectedMessage) {
        BrowserUtils.sleep(2);
        String actualErrorMessage = addEventPageEy.errorMessage.getText();
        Assert.assertTrue(addEventPageEy.errorMessage.isDisplayed());
        Assert.assertEquals("Error message is expected..", actualErrorMessage, expectedMessage);
    }

    //AddEventPage_EY addEventPage =new AddEventPage_EY();
//    @Given("I am on the login page")
//    public void i_am_on_the_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//    }
//    @When("I enter the user1 credentials")
//    public void i_enter_the_user1_credentials() {
//        //addEventPage.login("driver_username", "driver_password");
//        LoginPage loginPage = new LoginPage();

//        loginPage.login("user1", "UserUser123");
//    }
//    @Then("I should be able to login")
//    public void i_should_be_able_to_login() {
//
//        BrowserUtils.waitForTitleContains("Dashboard");
//
//        String expectedTitle = "Dashboard";
//        String actualTitle = Driver.getDriver().getTitle();
//        Assert.assertEquals("Title verification Failed!!",expectedTitle,actualTitle);
//

//    }

//    @When("I click Activities and Calendar event submodule")
//    public void iClickActivitiesAndCalendarEventSubmodule() {
//
//    }
//
//    @When("I click create calendar event button")
//    public void i_click_create_calendar_event_button() {
//
//    }
//
//    @Then("I should be able to access calendar event site")
//    public void i_should_be_able_to_access_calendar_event_site() {
//

//    }

}
