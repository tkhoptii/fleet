package com.vytrack.step_definitions;

import com.vytrack.pages.US01_DashboardPage_TK_Page;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US01_Dashboard_TK_StepDefs {


    US01_DashboardPage_TK_Page us01DashboardPageTkPage = new US01_DashboardPage_TK_Page();


    @Then("the user should see the following module names:")
    public void theUserShouldSeeTheFollowingModuleNames(List<String> expectedMainModules) {
        us01DashboardPageTkPage.waitUntilLoaderScreenDisappear();
        List<String> actualModules = BrowserUtils.getElementsText(us01DashboardPageTkPage.menuOptions);
        System.out.println("actualModules = " + actualModules);
        System.out.println("expectedMainModules = " + expectedMainModules);
        Assert.assertEquals(expectedMainModules, actualModules);
    }
}
