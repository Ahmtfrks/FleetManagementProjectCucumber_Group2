package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.Driver;
import org.apache.commons.compress.harmony.pack200.PackingUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage extends BasePage {

    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBys({
            @FindBy(xpath = "(//span[@class='title title-level-1'])[1]"),
            @FindBy(xpath = "(//span[@class='title title-level-1'])[2]"),
            @FindBy(xpath = "(//span[@class='title title-level-1'])[3]"),
            @FindBy(xpath = "(//span[@class='title title-level-1'])[4]"),
            @FindBy(xpath = "(//span[@class='title title-level-1'])[5]"),
            @FindBy(xpath = "(//span[@class='title title-level-1'])[6]"),
            @FindBy(xpath = "(//span[@class='title title-level-1'])[7]"),
            @FindBy(xpath = "(//span[@class='title title-level-1'])[8]"),
    })
    public List<WebElement> MainModules;




//    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
//    public List<WebElement> DashboardsModule;
//
//    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
//    public List<WebElement> FleetModule;
//
//    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
//    public List<WebElement> CustomersModule;
//
//    @FindBy(xpath = "(//span[@class='title title-level-1'])[4]")
//    public List<WebElement> SalesModule;
//
//    @FindBy(xpath = "(//span[@class='title title-level-1'])[5]")
//    public List<WebElement> ActivitiesModule;
//
//    @FindBy(xpath = "(//span[@class='title title-level-1'])[6]")
//    public List<WebElement> MarketingModule;
//
//    @FindBy(xpath = "(//span[@class='title title-level-1'])[7]")
//    public List<WebElement> ReportsSegmentsModule;
//
//    @FindBy(xpath = "(//span[@class='title title-level-1'])[8]")
//    public List<WebElement> SystemModule;

}
