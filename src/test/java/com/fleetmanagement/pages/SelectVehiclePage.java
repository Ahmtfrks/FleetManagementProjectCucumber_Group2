package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectVehiclePage extends BasePage {

    public SelectVehiclePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//div[@class='btn-group dropdown']")
//    public WebElement selectingAllCarsBtn;

    @FindBy(xpath = "//div[@class='btn-group dropdown']//input[@type='checkbox']")
    public WebElement selectingAllCarsBtn;



    @FindBy(xpath = "(//input[@type='checkbox'])[24]")
    public WebElement selectAnyCar;

//    @FindBy(xpath = "//tbody[@class='grid-body']")
//    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr/td//input[@type='checkbox']")
    public List<WebElement> checkBoxes;
}


//(//button[@class='btn btn-default btn-small dropdown-toggle'])[1]
//(//input[@type='checkbox'])[20]