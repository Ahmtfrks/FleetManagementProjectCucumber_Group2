package com.fleetmanagement.pages;

import com.fleetmanagement.utilities.BrowserUtils;
import com.fleetmanagement.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

/**
 * This page includes common method and web element about fleet management app
 */
public abstract class BasePage {

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//*[@class='launcher-item']//a")
   // @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu']//*[@class='launcher-item']//a")
    public List<WebElement> list_Icon;


    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    public List<WebElement> list_checkbox;

    @FindBy(xpath = "(//table//th//input[@type='checkbox'])[1]")
    public WebElement check_all;


    public void checkThreeDots(List<String> expectedOptions) {

        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println("i = " + i);

        String locator = "(//div[@class='dropdown']//*[text()='...'])[" + (i + 1) + "]";
        BrowserUtils.sleep(2);
        WebElement eachThreeDot = Driver.getDriver().findElement(By.xpath(locator));
        BrowserUtils.sleep(2);
        BrowserUtils.hover(eachThreeDot);
        BrowserUtils.sleep(2);
        List<String> actualOptions = BrowserUtils.getElementsTextWithAttribute("title", list_Icon);
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedOptions, actualOptions);
        BrowserUtils.sleep(2);

    }

//    public void checkAllCheckboxes(String isChecked) {
//
//        boolean res = isChecked.equals("unchecked") ? false : true;
//
//        System.out.println("list_checkbox.size() = " + list_checkbox.size());
//
//        for (WebElement checkbox : new VehiclesPage().list_checkbox) {
//            BrowserUtils.hover(checkbox);
//            Assert.assertEquals(res, checkbox.isSelected());
//        }
//
//    }


//    public void selectCar(int row) {
//        WebElement car = list_checkbox.get(row - 1);
//        BrowserUtils.hoverAndClick(car);
//
//    }

    public void verifyCarIsSelected(int row,String isChecked) {
        boolean res = isChecked.equals("unchecked") ? false : true;

        WebElement car = list_checkbox.get(row - 1);
        Assert.assertEquals(res,car.isSelected());

    }

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;


    @FindBy(css ="div[id='progressbar']" )
    protected WebElement progressBar;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;//TODO find this element




    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void waitUntilLoaderScreenDisappearForProgressBar() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(progressBar));
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    public String getUserName() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }

    public void logOut() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }

    public void goToMyUser() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(myUser, 5).click();

    }

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Fleet, and module equals to Vehicle,
     * Then method will navigate user to Fleet to Vehicle
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)), 5);
        }
        }
        }




