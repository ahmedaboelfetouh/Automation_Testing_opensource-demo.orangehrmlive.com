package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPIMPage extends BasePage {

    public AddUserPIMPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder=\"First Name\"]")
    private WebElement firstName;

    public void setFirstName(String name){
        BasePage.WaitingForElementToBeVisible(firstName);
        firstName.sendKeys(name);
    }

    @FindBy(xpath = "//input[@placeholder=\"Middle Name\"]")
    private WebElement middleName;

    public void setMiddleName(String name){
        BasePage.WaitingForElementToBeVisible(middleName);
        firstName.sendKeys(name);
    }

    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
    private WebElement lastName;

    public void setLastName(String name){
        BasePage.WaitingForElementToBeVisible(lastName);
        firstName.sendKeys(name);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    private WebElement emplyeeId;

    public void setEmplyeeId(String num){
        emplyeeId.sendKeys(num);
    }

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private WebElement createLoginDetailsCheck;

    private void createLoginDetailsFun(){
        createLoginDetailsCheck.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div:nth-child(4) > div > div:nth-child(1) > div > div:nth-child(2) > input")
    private WebElement userName;

    public void setUserName(String name) {
        userName.sendKeys(name);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label")
    private WebElement enableCheck;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/label")
    private WebElement disableCheck;

    public void enableButton(){
        if (!enableCheck.isSelected()){
            enableCheck.click();
        }
    }

    public void disableButton(){
        if (!disableCheck.isSelected()){
            disableCheck.click();
        }
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div.oxd-form-row.user-password-row > div > div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell > div > div:nth-child(2) > input")
    private WebElement employeePassword;

    public void setEmployeePassword(String password){
        employeePassword.sendKeys(password);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div.oxd-form-row.user-password-row > div > div:nth-child(2) > div > div:nth-child(2) > input")
    private WebElement employeeConfirmPassword;

    public void setEmployeeConfirmPassword(String password){
        employeePassword.sendKeys(password);
    }

    @FindBy(xpath = "//input[@type=\"file\"]")
    private WebElement employeePhoto;

    public void setEmployeePhoto(String path){
        employeePhoto.sendKeys(path);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement saveButton;

    public void clickOnSaveButton(){
        BasePage.WaitingForElementToBeVisible(saveButton);
        saveButton.submit();
    }
}
