package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditUserPage extends BasePage {

    @FindBy(xpath = "//label[text()='User Role']/following::div[contains(@class,'oxd-select-text-input')][1]")
    private WebElement userRoleDropdown;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
    private WebElement userRoleOptionAdmin;
    @FindBy(xpath = "//label[text()='Status']/following::div[contains(@class, 'oxd-select-text-input')][1]")
    private WebElement statusDropdown;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Enabled']")
    private WebElement statusOptionEnabled;
    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    private WebElement employeeName;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > input")
    private  WebElement userName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[5]/div/div[2]/div/label")
    private WebElement checkbox;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-row.user-password-row > div > div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell > div > div:nth-child(2) > input")
    private WebElement employeePassword;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-row.user-password-row > div > div:nth-child(2) > div > div:nth-child(2) > input")
    private WebElement employeeConfirmPassword;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement saveButton;
    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    private WebElement saveVerifacation;

    public EditUserPage(WebDriver driver) {
        super(driver);
    }

    public void selectUserRole() {
        BasePage.WaitingForElementToBeVisible(userRoleDropdown);
        userRoleDropdown.click();
        userRoleOptionAdmin.click();
        logger.debug("Edit User In Admin Module: Select User Role");
    }

    public void selectStatusAsEnabled() {
        statusDropdown.click();
        statusOptionEnabled.click();
        logger.debug("Edit User In Admin Module: Select Status");
    }

    public void setEmployeeName(String name){
        BasePage.WaitingForElementToBeVisible(employeeName);
        employeeName.sendKeys(name);
        logger.debug("Edit User In Admin Module: Set Employee Name");
    }

    public void setUserName(String name){
        BasePage.WaitingForElementToBeVisible(userName);
        userName.sendKeys(name);
        logger.debug("Edit User In Admin Module: Set Admin Name");
    }

    public void clickOnCheckbox(){
        BasePage.WaitingForElementToBeClickable(checkbox);
        checkbox.click();
        logger.debug("Edit User In Admin Module: Click On Password Checkbox");
    }

    public void setEmployeePassword(String password){
        BasePage.WaitingForElementToBeVisible(employeePassword);
        employeePassword.sendKeys(password);
        logger.debug("Edit User In Admin Module: Set Admin Password");
    }

    public void setEmployeeConfirmPassword(String password){
        BasePage.WaitingForElementToBeVisible(employeeConfirmPassword);
        employeeConfirmPassword.sendKeys(password);
        logger.debug("Edit User In Admin Module: Set Admin Confirmation Password");
    }

    public String checkSaveVerification(){
        BasePage.WaitingForElementToBeVisible(saveVerifacation);
        logger.debug("Edit User In Admin Module: Verifiaction of Save Message");
        return saveVerifacation.getText();
    }

    public void clickOnSaveButton(){
        BasePage.WaitingForElementToBeClickable(saveButton);
        saveButton.submit();
        logger.debug("Edit User In Admin Module: Click On Save Button");
    }
}
