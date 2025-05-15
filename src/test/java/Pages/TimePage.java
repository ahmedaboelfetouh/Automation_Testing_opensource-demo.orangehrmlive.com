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


    //assertions
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement TimeModuleLabel;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li.--active.oxd-topbar-body-nav-tab.--parent > ul > li:nth-child(2) > a")
    WebElement AttendanceDropDownMenuLabel;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement PunchInOutModuleLabel;


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
        assertEquals("Punch In/Out",AttendanceDropDownMenuLabel.getText());
        logger.debug("Time module ➡\uFE0F ✅ Attendance Drop Down Menu is Opened Successfully");
    }
    public void OpenPunchInOutModule(){
        WaitingForElementToBeClickable(PunchInOutModule);
        PunchInOutModule.click();
        BasePage.WaitingForElementToBeVisible(PunchInOutModuleLabel);
        assertEquals(PunchInOutModuleLabel.getText(), "Attendance");
        logger.debug("Time module ➡\uFE0F ✅ Punch In/Out Page is Opened Successfully");
    }


//    public void Login(String username,String password){
//        SetUserName(username);
//        SetPassword(password);
//        ClickButton();
//    }
}
