/******************************************************************************
 *
 * Module: Performance
 *
 * File Name: PerformancePage.java
 *
 * Description: Functions and Locators for Add/Search for APK Feature for Performance Module
 *
 * Author: Ahmed Aboelfetouh
 *
 *******************************************************************************/
package Pages;

import Base.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.AssertJUnit.assertEquals;

public class PerformancePage extends BasePage {
    public PerformancePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(7) > a")
    WebElement PerformanceModule;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement PerformanceModuleLabel;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li:nth-child(1)")
    WebElement ConfigureDropDownMenu;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li.--active.oxd-topbar-body-nav-tab.--parent > ul > li:nth-child(1)")
    WebElement KPISelector;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-header > div.oxd-table-filter-header-title > h5")
    WebElement KPISelectorLabel;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button")
    WebElement AddKPIButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > p")
    WebElement AddKPILabel;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > input")
    WebElement KeyPerformanceIndicator;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > input")
    WebElement MinimumRating;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    WebElement SaveButton;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > div.oxd-select-text-input")
    WebElement JobTitleDropDownList;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='QA Engineer']")
    WebElement JobTitleValue;

    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    WebElement SuccessMessage;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-header > div.oxd-table-filter-header-title > h5")
    WebElement APKSearchLabel;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div")
    WebElement JobTitleDropDownListSearch;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='QA Engineer']")
    WebElement JobTitleValueSearch;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    WebElement SearchButton;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(1) > div > div:nth-child(2) > div")
    WebElement KPILabel;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(1) > div > div:nth-child(3) > div")
    WebElement JobTitleLabel;


    public void OpenPerformanceModule(){
        WaitingForElementToBeVisible(PerformanceModule);
        PerformanceModule.click();
        BasePage.WaitingForElementToBeVisible(PerformanceModuleLabel);
        assertEquals("Performance",PerformanceModuleLabel.getText());
        logger.debug("Performance module ➡\uFE0F ✅ Performance Module is Opened Successfully");
    }

    public void OpenConfigureKPI(){
        WaitingForElementToBeVisible(ConfigureDropDownMenu);
        ConfigureDropDownMenu.click();
        WaitingForElementToBeVisible(KPISelector);
        KPISelector.click();
        WaitingForElementToBeVisible(KPISelectorLabel);
        assertEquals("Key Performance Indicators for Job Title",KPISelectorLabel.getText());
        logger.debug("Performance module ➡\uFE0F ✅ APK Configuration Page is Opened Successfully");
    }

    public void AddKPI(){
        WaitingForElementToBeVisible(AddKPIButton);
        AddKPIButton.click();
        WaitingForElementToBeVisible(AddKPILabel);
        assertEquals("Add Key Performance Indicator",AddKPILabel.getText());
        WaitingForElementToBeVisible(KeyPerformanceIndicator);
        KeyPerformanceIndicator.sendKeys("Automation Testing");
        MinimumRating.clear();
        MinimumRating.sendKeys("10");
        BasePage.WaitingForElementToBeVisible(JobTitleDropDownList);
        JobTitleDropDownList.click();
        JobTitleValue.click();
        SaveButton.click();
        WaitingForElementToBeVisible(SuccessMessage);
        assertEquals("Success",SuccessMessage.getText());
        logger.debug("Performance module ➡\uFE0F ✅ KPI is Added Successfully");
    }

    public void APKSearch(){
        WaitingForElementToBeVisible(APKSearchLabel);
        assertEquals("Key Performance Indicators for Job Title",APKSearchLabel.getText());
        JobTitleDropDownListSearch.click();
        JobTitleValueSearch.click();
        SearchButton.click();
        WaitingForElementToBeVisible(KPILabel);
        WaitingForElementToBeVisible(JobTitleLabel);
        assertEquals("Automation Testing",KPILabel.getText());
        assertEquals("QA Engineer",JobTitleLabel.getText());
        logger.debug("Performance module ➡\uFE0F ✅ Search is Done Successfully");
    }
}
