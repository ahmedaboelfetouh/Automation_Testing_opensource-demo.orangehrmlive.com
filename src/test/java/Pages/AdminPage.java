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
        BasePage.WaitingForElementToBeVisible(adminButton);
        adminButton.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button")
    WebElement addButton;

    public void cliCkOnAddButton(){
        BasePage.WaitingForElementToBeVisible(addButton);
        addButton.click();
    }


    @FindBy(css = "div.oxd-select-text-input")
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
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Daniel Thomas Anderson']")
    private WebElement employeeNameOption;

    public void setEmployeeName(){
        BasePage.WaitingForElementToBeVisible(employeeName);
        employeeName.sendKeys("Daniel");
        BasePage.WaitingForElementToBeClickable(employeeNameOption);
        employeeNameOption.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > input")
    private  WebElement userName;

    public void setUserName(String name){
        BasePage.WaitingForElementToBeVisible(userName);
        userName.sendKeys(name);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-row.user-password-row > div > div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell > div > div:nth-child(2) > input")
    private WebElement employeePassword;

    public void setEmployeePassword(String password)
    {
        BasePage.WaitingForElementToBeVisible(employeePassword);
        employeePassword.sendKeys(password);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    private WebElement employeeConfirmPassword;

    public void setEmployeeConfirmPassword(String password){
        BasePage.WaitingForElementToBeVisible(employeeConfirmPassword);
        employeeConfirmPassword.sendKeys(password);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement saveButton;

    public void clickOnSaveButton(){
        BasePage.WaitingForElementToBeClickable(saveButton);
        saveButton.submit();
    }


    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    private WebElement saveVerifacation;

    public void checkSaveVerification(){
        System.out.println(saveButton.isDisplayed());
    }

    EditUserPage obj;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]")
    private WebElement editButton;

    public void clickOnEditFun(){
        BasePage.WaitingForElementToBeVisible(editButton);
        editButton.click();
        //BasePage.WaitingForElement(driver.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > h6")));
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(3) > div > div:nth-child(6) > div > button:nth-child(1)")
    private WebElement deleteButton;

    public void clickOnDeleteButton(){
        BasePage.WaitingForElementToBeClickable(deleteButton);
        deleteButton.click();
    }

    @FindBy(css = "#app > div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered > div > div > div > div.orangehrm-modal-header > p")
    private WebElement deleteMessageVerification;
    public void checkDeleteMessageVerification(){
        BasePage.WaitingForElementToBeVisible(deleteMessageVerification);
        System.out.println(deleteMessageVerification.isDisplayed());
    }

    @FindBy(css = "#app > div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered > div > div > div > div.orangehrm-modal-footer > button.oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin")
    private WebElement deleteButtonAlert;
    public void clickOnDeleteButtonAlert(){
        BasePage.WaitingForElementToBeClickable(deleteButtonAlert);
        deleteButtonAlert.click();
    }


}

