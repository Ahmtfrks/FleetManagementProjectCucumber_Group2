package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesModelsPage extends BasePage {

    public VehiclesModelsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]")
    public WebElement FleetModule;

    @FindBy(xpath = "//span[.='Vehicles Model']")
    public WebElement vehiclesModel;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement message;

    @FindBys({
            @FindBy(xpath = "//thead[@class='grid-header']//th[2]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[3]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[4]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[5]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[6]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[7]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[8]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[9]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[10]"),
            @FindBy(xpath = "//thead[@class='grid-header']//th[11]")
    })

    public List<WebElement> columnNames;


}
