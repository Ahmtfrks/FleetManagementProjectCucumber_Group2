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

    @Then("the user that is Truck Driver sees {int} <module> names options:")
    public void theUserThatIsTruckDriverSeesFourModuleNamesOptions(int countOfModules, List<String> mainModules) {
//        BrowserUtils.sleep(2);
//        for (int i = 0; i < countOfModules; i++) {
//            List<String> mainModulesNames = BrowserUtils.getElementsText(mainModulesPage.MainModules);
//            Assert.assertEquals(mainModules.get(i), mainModulesNames.get(i));
//        }
    }
}
