/******************************************************************************
 *
 * Module: Time
 *
 * File Name: TimePage.java
 *
 * Description: Functions and Locators for PunchIn/Out Feature for Time Module
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

public class TimePage extends BasePage {

    public TimePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(4) > a")
    WebElement TimeModule;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li:nth-child(2) > span")
    WebElement AttendaceDropDownMenu;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li.--active.oxd-topbar-body-nav-tab.--parent > ul > li:nth-child(2) > a")
    WebElement PunchInOutModule;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > form > div:nth-child(2) > div > div > div > div:nth-child(2) > textarea")
    WebElement PunchInNotesText;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > form > div.oxd-form-actions > button")
    WebElement PunchInButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > form > div:nth-child(2) > div > div > div > div:nth-child(2) > textarea")
    WebElement PunchOutNotesText;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > form > div.oxd-form-actions > button")
    WebElement PunchOutButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > input")
    WebElement PunchInTime;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > div > div > input")
    WebElement PunchOutTime;

    //assertions
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement TimeModuleLabel;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li.--active.oxd-topbar-body-nav-tab.--parent > ul > li:nth-child(2) > a")
    WebElement AttendanceDropDownMenuLabel;
    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    WebElement SuccessMessage;



    public void OpenTimeModule(){
        WaitingForElementToBeVisible(TimeModule);
        TimeModule.click();
        BasePage.WaitingForElementToBeVisible(TimeModuleLabel);
        assertEquals("Time",TimeModuleLabel.getText());
        logger.debug("Time module ➡\uFE0F ✅ Time Module is Opened Successfully");
    }
    public void OpenAttendanceMenu(){
        WaitingForElementToBeClickable(AttendaceDropDownMenu);
        AttendaceDropDownMenu.click();
        BasePage.WaitingForElementToBeVisible(AttendanceDropDownMenuLabel);
        assertEquals("Punch In/Out",AttendanceDropDownMenuLabel.getText());
        logger.debug("Time module ➡\uFE0F ✅ Attendance Drop Down Menu is Opened Successfully");
    }
    public void OpenPunchInOutModule(){
        WaitingForElementToBeClickable(PunchInOutModule);
        PunchInOutModule.click();
        logger.debug("Time module ➡\uFE0F ✅ Punch In/Out Page is Opened Successfully");
    }

    public void SetPunchInData(){
        WaitingForElementToBeVisible(PunchInNotesText);
        PunchInNotesText.clear();
        PunchInNotesText.sendKeys("Arrival of the user");
        logger.debug("Time module ➡\uFE0F ✅ Punch In Data is Entered Successfully");
    }

    public void SetPunchOutData(){
        WaitingForElementToBeVisible(PunchOutNotesText);
        PunchOutNotesText.clear();
        PunchOutNotesText.sendKeys("Leaving of the user");
        logger.debug("Time module ➡\uFE0F ✅ Punch Out Notes is Entered Successfully");
    }

    public void SubmitPunchIn(){
        WaitingForElementToBeClickable(PunchInButton);
        PunchInButton.click();
        logger.debug("Time module ➡\uFE0F ✅ Punch In Button is Clicked Successfully");
        WaitingForElementToBeVisible(SuccessMessage);
        assertEquals("Success",SuccessMessage.getText());
    }

    public void SubmitPunchOut(){
        WaitingForElementToBeClickable(PunchOutButton);
        PunchOutButton.click();
        logger.debug("Time module ➡\uFE0F ✅ Punch Out Button is Clicked Successfully");
        WaitingForElementToBeVisible(SuccessMessage);
        assertEquals("Success",SuccessMessage.getText());
    }
}
