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


    public EditUserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[text()='User Role']/following::div[contains(@class,'oxd-select-text-input')][1]")
    private WebElement userRoleDropdown;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
    private WebElement userRoleOptionAdmin;


    public void selectUserRole() {
        BasePage.WaitingForElementToBeVisible(userRoleDropdown);
        userRoleDropdown.click();
        userRoleOptionAdmin.click();
    }

    @FindBy(xpath = "//label[text()='Status']/following::div[contains(@class, 'oxd-select-text-input')][1]")
    private WebElement statusDropdown;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Enabled']")
    private WebElement statusOptionEnabled;

    public void selectStatusAsEnabled() {
        statusDropdown.click();
        statusOptionEnabled.click();
    }


    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    private WebElement employeeName;

    public void setEmployeeName(String name){
        employeeName.sendKeys(name);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > input")
    private  WebElement userName;

    public void setUserName(String name){
        userName.sendKeys(name);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[5]/div/div[2]/div/label")
    private WebElement checkbox;

    public void clickOnCheckbox(){
        BasePage.WaitingForElementToBeClickable(checkbox);
        checkbox.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-row.user-password-row > div > div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell > div > div:nth-child(2) > input")
    private WebElement employeePassword;

    public void setEmployeePassword(String password){
        employeePassword.sendKeys(password);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-row.user-password-row > div > div:nth-child(2) > div > div:nth-child(2) > input")
    private WebElement employeeConfirmPassword;

    public void setEmployeeConfirmPassword(String password){
        employeePassword.sendKeys(password);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement saveButton;

    public void clickOnSaveButton(){
        saveButton.submit();
    }


}
