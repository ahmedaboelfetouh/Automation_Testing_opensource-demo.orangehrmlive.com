package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AdminPage extends BasePage {

    @FindBy(xpath = "//a[@href=\"/web/index.php/admin/viewAdminModule\"]")
    private WebElement adminButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button")
    private WebElement addButton;
    @FindBy(css = "div.oxd-select-text-input")
    private WebElement userRoleDropdown;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
    private WebElement userRoleOptionAdmin;
    @FindBy(xpath = "//label[text()='Status']/following::div[contains(@class, 'oxd-select-text-input')][1]")
    private WebElement statusDropdown;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Enabled']")
    private WebElement statusOptionEnabled;
    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    private WebElement employeeName;
    @FindBy(xpath = "//div[@role='listbox']//span")
    private List<WebElement> employeeNameOptions;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > input")
    private  WebElement userName;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-row.user-password-row > div > div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell > div > div:nth-child(2) > input")
    private WebElement employeePassword;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    private WebElement employeeConfirmPassword;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement saveButton;
    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    private WebElement saveVerifacation;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]")
    private WebElement editButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(3) > div > div:nth-child(6) > div > button:nth-child(1)")
    private WebElement deleteButton;
    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    private WebElement deleteMessageVerification;
    @FindBy(css = "#app > div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered > div > div > div > div.orangehrm-modal-footer > button.oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin")
    private WebElement deleteButtonAlert;

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAdminButton(){
        BasePage.WaitingForElementToBeVisible(adminButton);
        adminButton.click();
        logger.debug("Admin Module: Click On Admin Button");
    }

    public void cliCkOnAddButton(){
        BasePage.WaitingForElementToBeVisible(addButton);
        addButton.click();
        logger.debug("Add User In Admin Module: Click On Add Button");
    }

    public void selectUserRole() {
        BasePage.WaitingForElementToBeVisible(userRoleDropdown);
        userRoleDropdown.click();
        userRoleOptionAdmin.click();
        logger.debug("Add User In Admin Module: Select User Role");
    }

    public void selectStatusAsEnabled() {
        statusDropdown.click();
        statusOptionEnabled.click();
        logger.debug("Add User In Admin Module: Select Status");
    }

    public void setEmployeeName(){
        BasePage.WaitingForElementToBeVisible(employeeName);
        employeeName.sendKeys("a");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> !employeeNameOptions.isEmpty());

        WebElement firstOption = employeeNameOptions.get(0);
        BasePage.WaitingForElementToBeClickable(firstOption);
        firstOption.click();

        logger.debug("Add User In Admin Module: Set Employee Name - First option selected");
    }

    public void setUserName(String name){
        BasePage.WaitingForElementToBeVisible(userName);
        userName.sendKeys(name);
        logger.debug("Add User In Admin Module: Set Admin Name");
    }

    public void setEmployeePassword(String password)
    {
        BasePage.WaitingForElementToBeVisible(employeePassword);
        employeePassword.sendKeys(password);
        logger.debug("Add User In Admin Module: Set Admin Password");
    }

    public void setEmployeeConfirmPassword(String password){
        BasePage.WaitingForElementToBeVisible(employeeConfirmPassword);
        employeeConfirmPassword.sendKeys(password);
        logger.debug("Add User In Admin Module: Set Admin cofirmation Password");
    }

    public void clickOnSaveButton(){
        BasePage.WaitingForElementToBeClickable(saveButton);
        saveButton.submit();
        logger.debug("Add User In Admin Module: Click On Save Button");
    }

    public String checkSaveVerification(){
        BasePage.WaitingForElementToBeVisible(saveVerifacation);
        logger.debug("Add User In Admin Module: Verification of Add Message is displayed");
        return saveVerifacation.getText();
    }

    public void clickOnEditFun(){
        BasePage.WaitingForElementToBeVisible(editButton);
        editButton.click();
        logger.debug("Edite User In Admin Module: Click On Edite Button");
    }

    public void clickOnDeleteButton(){
        BasePage.WaitingForElementToBeClickable(deleteButton);
        deleteButton.click();
        logger.debug("Delete User In Admin Module: Click On Delete Button");
    }

    public String checkDeleteMessageVerification(){
        BasePage.WaitingForElementToBeVisible(deleteMessageVerification);
        logger.debug("Delete User In Admin Module: Verification of Delete Message is displayed");
        return deleteMessageVerification.getText();
    }

    public void clickOnDeleteButtonAlert(){
        BasePage.WaitingForElementToBeClickable(deleteButtonAlert);
        deleteButtonAlert.click();
        logger.debug("Delete User In Admin Module: Click On Delete Button Alert");
    }
}

