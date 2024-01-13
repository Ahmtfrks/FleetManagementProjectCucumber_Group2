package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage extends BasePage {

    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "main-menu")
    public WebElement mainMenu;

}
