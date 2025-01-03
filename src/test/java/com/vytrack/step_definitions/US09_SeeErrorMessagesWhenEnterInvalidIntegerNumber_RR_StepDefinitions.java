package com.vytrack.step_definitions;

import com.vytrack.pages.US09_SeeErrorMessagesWhenEnterInvalidIntegerNumber_RR_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US09_SeeErrorMessagesWhenEnterInvalidIntegerNumber_RR_StepDefinitions {

    US09_SeeErrorMessagesWhenEnterInvalidIntegerNumber_RR_Page us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage = new US09_SeeErrorMessagesWhenEnterInvalidIntegerNumber_RR_Page();


    @And("users if enter less than one should see \"The value have not to be less than one.”")
    public void usersIfEnterLessThanOneShouldSeeTheValueHaveNotToBeLessThanOne() throws Throwable {

        us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage.repeatEverySpace.click();
        us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage.repeatEverySpace.sendKeys(Keys.BACK_SPACE);
        us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage.repeatEverySpace.sendKeys("-1", Keys.ENTER);
        Assert.assertTrue(us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage.errorMessageLess.isDisplayed());



    }


    @Then("users if enter more than {int} should see “The value have not to be more than {int}.”")
    public void users_if_enter_more_than_should_see_the_value_have_not_to_be_more_than(Integer int1, Integer int2) {
        us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage.repeatEverySpace.click();
        us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage.repeatEverySpace.sendKeys(Keys.BACK_SPACE);
        us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage.repeatEverySpace.sendKeys("100", Keys.ENTER);
        Assert.assertTrue(us09SeeErrorMessagesWhenEnterInvalidIntegerNumberRrPage.errorMessageMore.isDisplayed());

    }






}
