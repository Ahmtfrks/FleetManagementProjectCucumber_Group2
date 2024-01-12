package com.fleetmanagement.stepDefinitions;

import io.cucumber.java.en.Then;

public class MainModulesStepDefinition {
    @Then("the user that are Store and Sales managers see {int} <module> names")
    public void theUserThatAreStoreAndSalesManagersSeeModuleNames(Integer expectedMainModules) {
    }

    @Then("the user that is Truck Driver sees {int} <module> names")
    public void theUserThatIsTruckDriverSeesModuleNames(Integer expectedMainModules) {
    }
}
