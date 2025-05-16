/******************************************************************************
 *
 * Module: Claim
 *
 * File Name: ClaimPage.java
 *
 * Description: Functions and Locators for Assign Claim Feature for Claim Module
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

public class ClaimPage extends BasePage {
    public ClaimPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(11) > a")
    WebElement ClaimModule;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6")
    WebElement ClaimModuleLabel;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li:nth-child(5) > a")
    WebElement AssignClaimButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > h6")
    WebElement AssignClaimLabel;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div > div > div:nth-child(2) > div > div > input")
    WebElement EmployeeName;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Admin  Admin123']")
    WebElement EmployeeNameSelection;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(3) > div > div > div > div:nth-child(2) > textarea")
    WebElement Remarks;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > div > div")
    WebElement EventDropDownList;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Travel Allowance - Ahmed Aboelfetouh']")
    WebElement EventSelection;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(2) > div > div")
    WebElement CurrencyDropDownList;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Egyptian Pound']")
    WebElement CurrencySelection;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    WebElement CreateClaimButton;

    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    WebElement SuccessMessage;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div.orangehrm-card-container > h6")
    WebElement SubmitClaimPageLabel;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div.orangehrm-action-button-container > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-sm-button")
    WebElement SubmitClaimButton;




    public void OpenClaimModule(){
        WaitingForElementToBeVisible(ClaimModule);
        ClaimModule.click();
        BasePage.WaitingForElementToBeVisible(ClaimModuleLabel);
        assertEquals("Claim",ClaimModuleLabel.getText());
        logger.debug("Claim module ➡\uFE0F ✅ Claim Module is Opened Successfully");
    }

    public void OpenAssignClaim(){
        WaitingForElementToBeClickable(AssignClaimButton);
        AssignClaimButton.click();
        WaitingForElementToBeVisible(AssignClaimLabel);
        assertEquals("Create Claim Request",AssignClaimLabel.getText());
        logger.debug("Claim module ➡\uFE0F ✅ Assign Claim Page is Opened Successfully");
    }

    public void EnterAssignClaimData(){
        WaitingForElementToBeVisible(EmployeeName);
        EmployeeName.sendKeys("Admin");
        WaitingForElementToBeVisible(EmployeeNameSelection);
        EmployeeNameSelection.click();
        WaitingForElementToBeVisible(EventDropDownList);
        EventDropDownList.click();
        EventSelection.click();
        WaitingForElementToBeVisible(CurrencyDropDownList);
        CurrencyDropDownList.click();
        CurrencySelection.click();
        WaitingForElementToBeVisible(Remarks);
        Remarks.sendKeys("Test");
        CreateClaimButton.click();
        WaitingForElementToBeVisible(SuccessMessage);
        assertEquals("Success",SuccessMessage.getText());
        logger.debug("Claim module ➡\uFE0F ✅ Claim is Created Successfully");
    }

    public void SubmitClaim(){
        WaitingForElementToBeVisible(SubmitClaimPageLabel);
        assertEquals("Assign Claim",SubmitClaimPageLabel.getText());
        WaitingForElementToBeClickable(SubmitClaimButton);
        SubmitClaimButton.click();
        WaitingForElementToBeVisible(SuccessMessage);
        assertEquals("Success",SuccessMessage.getText());
        logger.debug("Claim module ➡\uFE0F ✅ Claim is Submitted Successfully");
    }
}
