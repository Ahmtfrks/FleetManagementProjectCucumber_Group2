package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesModelsPage extends BasePage {

    public VehiclesModelsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='message']")
    public WebElement message;


    @FindBy(xpath = "//table/thead/tr/th/a/span[1]")
    public List<WebElement> tableColumnNames;

    @FindBy(xpath = "//div[@id='container']//a[contains(.,'Create Vehicles')]")
    public WebElement btnCreateVehiclesModel;


}
