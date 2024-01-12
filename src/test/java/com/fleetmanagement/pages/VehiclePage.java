package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclePage extends BasePage {

    @FindBy(xpath = "(//div[@class='dropdown']//*[text()='...'])[1]]")
    public WebElement threeDotsFirst;
    // @FindBy(xpath = "(//table[@class='grid table-hover table table-bordered table-condensed']/tbody//a[.='...'])[2]")
     @FindBy(xpath = "//div[@class='dropdown']//*[text()='...']")
     public WebElement threeDots;

    @FindBy(xpath = "//a[.='...']")
    public WebElement threeDot;


    public VehiclePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
