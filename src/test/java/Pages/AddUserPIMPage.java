package Pages;

import Base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPIMPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder=\"First Name\"]")
    private WebElement firstName;
    @FindBy(xpath = "//input[@placeholder=\"Middle Name\"]")
    private WebElement middleName;
    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
    private WebElement lastName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    private WebElement emplyeeId;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div.oxd-form-row.user-form-header > div > label > span")
    private WebElement createLoginDetailsCheck;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div:nth-child(4) > div > div:nth-child(1) > div > div:nth-child(2) > input")
    private WebElement userName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label")
    private WebElement enableCheck;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/label")
    private WebElement disableCheck;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div.oxd-form-row.user-password-row > div > div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell > div > div:nth-child(2) > input")
    private WebElement employeePassword;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div.oxd-form-row.user-password-row > div > div:nth-child(2) > div > div:nth-child(2) > input")
    private WebElement employeeConfirmPassword;
    @FindBy(xpath = "//input[@type=\"file\"]")
    private WebElement employeePhoto;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement saveButton;
    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    private WebElement saveVerifacation;

    public AddUserPIMPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstName(String name){
        BasePage.WaitingForElementToBeVisible(firstName);
        firstName.sendKeys(name);
        logger.debug("Add User In PIM Module: Set First Name");
    }

    public void setMiddleName(String name){
        BasePage.WaitingForElementToBeVisible(middleName);
        middleName.sendKeys(name);
        logger.debug("Add User In PIM Module: Set Middle Name");
    }

    public void setLastName(String name){
        BasePage.WaitingForElementToBeVisible(lastName);
        lastName.sendKeys(name);
        logger.debug("Add User In PIM Module: Set Last Name");
    }

    public void setEmplyeeId(String num){
        BasePage.WaitingForElementToBeVisible(emplyeeId);
        emplyeeId.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        emplyeeId.sendKeys(Keys.DELETE);
        emplyeeId.sendKeys(num);
        logger.debug("Add User In PIM Module: Set Employee ID");
    }

    public void createLoginDetailsFun(){
        BasePage.WaitingForElementToBeClickable(createLoginDetailsCheck);
        if (!createLoginDetailsCheck.isSelected()) {
            createLoginDetailsCheck.click();
        }
        logger.debug("Add User In PIM Module: Create Login Details Fun");
    }

    public void setUserName(String name) {
        BasePage.WaitingForElementToBeVisible(userName);
        userName.sendKeys(name);
        logger.debug("Add User In PIM Module: Set User Name");
    }

    public void enableButton(){
        BasePage.WaitingForElementToBeClickable(enableCheck);
        if (!enableCheck.isSelected()){
            enableCheck.click();
        }
        logger.debug("Add User In PIM Module: Set Enable Button");
    }

    public void disableButton(){
        BasePage.WaitingForElementToBeClickable(disableCheck);
        if (!disableCheck.isSelected()){
            disableCheck.click();
        }
        logger.debug("Add User In PIM Module: Set Disable Button");
    }

    public void setEmployeePassword(String password){
        BasePage.WaitingForElementToBeVisible(employeePassword);
        employeePassword.sendKeys(password);
        logger.debug("Add User In PIM Module: Set Employee Password");
    }

    public void setEmployeeConfirmPassword(String password){
        BasePage.WaitingForElementToBeVisible(employeeConfirmPassword);
        employeeConfirmPassword.sendKeys(password);
        logger.debug("Add User In PIM Module: Set Employee Confirm Password");
    }

    public void setEmployeePhoto(String path){
        BasePage.WaitingForElementToBeVisible(employeePhoto);
        employeePhoto.sendKeys(path);
        logger.debug("Add User In PIM Module: Set Employee Photo");
    }

    public void clickOnSaveButton(){
        BasePage.WaitingForElementToBeVisible(saveButton);
        saveButton.submit();
        logger.debug("Add User In PIM Module: Click On Save Button");
    }

    public String checkSaveVerification(){
        BasePage.WaitingForElementToBeVisible(saveVerifacation);
        logger.debug("Edit User In PIM Module: Verifiaction of Save Message");
        return saveVerifacation.getText();
    }
}
