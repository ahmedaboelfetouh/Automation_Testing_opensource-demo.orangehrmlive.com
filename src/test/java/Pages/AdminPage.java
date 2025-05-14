package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage {


    public AdminPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href=\"/web/index.php/admin/viewAdminModule\"]")
    private WebElement adminButton;

    public void clickOnAdminButton(){
        BasePage.WaitingForElement(adminButton);
        adminButton.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button")
    WebElement addButton;

    public void cliCkOnAddButton(){
        BasePage.WaitingForElement(addButton);
        addButton.click();
    }


    @FindBy(css = "div.oxd-select-text-input")
    private WebElement userRoleDropdown;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
    private WebElement userRoleOptionAdmin;

    public void selectUserRole() {
        BasePage.WaitingForElement(userRoleDropdown);
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

    EditUserPage obj;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]")
    private WebElement editButton;

    public void clickOnEditFun(){
        BasePage.WaitingForElement(editButton);
        editButton.click();
        //BasePage.WaitingForElement(driver.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > h6")));
    }



}

