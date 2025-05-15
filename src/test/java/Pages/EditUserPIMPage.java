
package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class EditUserPIMPage extends BasePage {

    public EditUserPIMPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input")
    private WebElement firstNameUser;

    public void setFirstNameUser(String name) {
        BasePage.WaitingForElementToBeVisible(firstNameUser);
        firstNameUser.clear();
        firstNameUser.sendKeys(name);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(2) > div:nth-child(2) > input")
    private WebElement middleNameUser;

    public void setMiddleNameUser(String name) {
        BasePage.WaitingForElementToBeVisible(middleNameUser);
        middleNameUser.clear();
        middleNameUser.sendKeys(name);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(3) > div:nth-child(2) > input")
    private WebElement lastNameUser;

    public void setLastNameUser(String name) {
        BasePage.WaitingForElementToBeVisible(lastNameUser);
        lastNameUser.clear();
        lastNameUser.sendKeys(name);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > input")
    private WebElement idUser;

    public void setIdUser(String id){
        BasePage.WaitingForElementToBeVisible(idUser);
        idUser.clear();
        idUser.sendKeys(id);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(2) > input")
    private WebElement otherIdUser;

    public void setOtherIdUser(String otherid){
        BasePage.WaitingForElementToBeVisible(otherIdUser);
        otherIdUser.clear();
        otherIdUser.sendKeys(otherid);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > input")
    private WebElement driverLicenseNumber;

    public void setDriverLicenseNumber(String number){
        BasePage.WaitingForElementToBeVisible(driverLicenseNumber);
        driverLicenseNumber.clear();
        driverLicenseNumber.sendKeys(number);
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > div > div > input")
    private WebElement licenceExpiryDate;

    public void setLicenceExpiryDate(String date){
        BasePage.WaitingForElementToBeVisible(licenceExpiryDate);
        licenceExpiryDate.clear();
        licenceExpiryDate.sendKeys(date);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement dropdownOfNationality;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Afghan']")
    private WebElement afghan;

    public void clickOnDropdownOfNationality(){
        BasePage.WaitingForElementToBeClickable(dropdownOfNationality);
        dropdownOfNationality.click();
        afghan.click();
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement dropdownOfMatrialStatus;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Single']")
    private WebElement single;

    public void clickOnDropdownOfMatrialStatus(){
        BasePage.WaitingForElementToBeClickable(dropdownOfMatrialStatus);
        dropdownOfMatrialStatus.click();
        single.click();
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > div > div > input")
    private WebElement dateOfBirth;

    public void setDateOfBirth(String date){
        BasePage.WaitingForElementToBeVisible(dateOfBirth);
        dateOfBirth.clear();
        dateOfBirth.sendKeys(date);
        dateOfBirth.clear();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div > div.--gender-grouped-field > div:nth-child(2) > div:nth-child(2) > div > label")
    private  WebElement femaleGender;

    public void setFemaleGender(){
        BasePage.WaitingForElementToBeClickable(femaleGender);
        femaleGender.click();
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div > div.--gender-grouped-field > div:nth-child(1) > div:nth-child(2) > div > label")
    private  WebElement maleGender;

    public void setMaleGender(){
        BasePage.WaitingForElementToBeClickable(maleGender);
        maleGender.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div.oxd-form-actions > button")
    private WebElement personalInfoSaveButton;

    public void clickOnPersonalInfoSaveButton(){
        BasePage.WaitingForElementToBeClickable(personalInfoSaveButton);
        personalInfoSaveButton.click();
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-row > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement dropdownOfBloodType;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='A+']")
    private WebElement bloodType;

    public void clickOnDropdownOfBloodType(){
        BasePage.WaitingForElementToBeClickable(dropdownOfBloodType);
        dropdownOfBloodType.click();
        bloodType.click();
    }



    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-actions > button")
    private WebElement customFieldSaveButton;

    public void clickOnCustomFieldSaveButton(){
        BasePage.WaitingForElementToBeClickable(customFieldSaveButton);
        customFieldSaveButton.click();
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-attachment > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > div > button")
    private WebElement addButton;

    public void clickOnAddButton(){
        BasePage.WaitingForElementToBeClickable(addButton);
        addButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-attachment > div > form > div:nth-child(1) > div > div > div > div:nth-child(2) > input")
    private WebElement fileInput;

    public void uploadFile(String filePath) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BasePage.WaitingForElementToBeVisible(fileInput);
        fileInput.clear();
        fileInput.sendKeys(filePath);
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-attachment > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement addAttachmentSaveButton;

    public void clickOnAddAttachmentSaveButton(){
        BasePage.WaitingForElementToBeClickable(addAttachmentSaveButton);
        addAttachmentSaveButton.click();
    }




}


