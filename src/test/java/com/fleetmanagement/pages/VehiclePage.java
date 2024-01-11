package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage extends BasePage{

    @FindBy(xpath = "//table/tbody//td[20]")
    public WebElement threeDots;
    public VehiclePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
