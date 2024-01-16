package com.fleetmanagement.stepDefinitions;

import com.fleetmanagement.pages.MainModulesPage;
import com.fleetmanagement.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class MainModulesStepDefinition {
    MainModulesPage mainModulesPage = new MainModulesPage();

    @Then("the user should see the following modules:")
    public void UserShouldSeeFollowingModuleNames(List<String> modules) {
        BrowserUtils.sleep(2);
        List<String> mainMenuValues = parseLines(mainModulesPage.mainMenu.getText());

//        Second way:
//        List<String> mainMenuValues = BrowserUtils.getElementsText(By.xpath("//*[@class='title title-level-1']"));

        Assert.assertEquals(modules, mainMenuValues);

    }

    private List<String> parseLines(String lines) {
        return Arrays.asList(lines.split("\n"));
    }

    @Then("the Truck Driver user should see the following modules:")
    public void truckDriverUserShouldSeeFollowingModuleNames(List<String> modules) {
        BrowserUtils.sleep(2);
        List<String> mainMenuValues = parseLines(mainModulesPage.mainMenu.getText());

        Assert.assertEquals(modules, mainMenuValues);
    }
}
