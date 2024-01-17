package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends LoginPage {


    public DashboardPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='oroplatform-header']/div[1]/div/ul/li[1]/a/i")
    public WebElement getHelpButton;


}
