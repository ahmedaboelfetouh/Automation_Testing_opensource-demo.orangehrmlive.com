
package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class EditUserPIMPage extends BasePage {

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input")
    private WebElement firstNameUser;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(2) > div:nth-child(2) > input")
    private WebElement middleNameUser;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div > div > div > div.--name-grouped-field > div:nth-child(3) > div:nth-child(2) > input")
    private WebElement lastNameUser;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > input")
    private WebElement idUser;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(2) > input")
    private WebElement otherIdUser;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > input")
    private WebElement driverLicenseNumber;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > div > div > input")
    private WebElement licenceExpiryDate;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement dropdownOfNationality;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Afghan']")
    private WebElement afghan;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement dropdownOfMatrialStatus;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Single']")
    private WebElement single;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > div > div > input")
    private WebElement dateOfBirth;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div > div.--gender-grouped-field > div:nth-child(2) > div:nth-child(2) > div > label")
    private  WebElement femaleGender;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div > div.--gender-grouped-field > div:nth-child(1) > div:nth-child(2) > div > label")
    private  WebElement maleGender;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div.oxd-form-actions > button")
    private WebElement personalInfoSaveButton;
    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    private WebElement saveVerifacationPersonalInfo;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-row > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement dropdownOfBloodType;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='A+']")
    private WebElement bloodType;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-actions > button")
    private WebElement customFieldSaveButton;
    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    private WebElement saveVerifacationCustomField;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-attachment > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > div > button")
    private WebElement addButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-attachment > div > form > div:nth-child(1) > div > div > div > div:nth-child(2) > input")
    private WebElement fileInput;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-attachment > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement addAttachmentSaveButton;
    @FindBy(css = "#oxd-toaster_1 > div > div.oxd-toast-start > div.oxd-toast-content.oxd-toast-content--success > p.oxd-text.oxd-text--p.oxd-text--toast-title.oxd-toast-content-text")
    private WebElement saveVerifacationAddAttachment;

    public EditUserPIMPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstNameUser(String name) {
        BasePage.WaitingForElementToBeVisible(firstNameUser);
        firstNameUser.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        firstNameUser.sendKeys(Keys.DELETE);
        firstNameUser.sendKeys(name);
        logger.debug("Edit User IN PIM Module: Set First Name User");
    }

    public void setMiddleNameUser(String name) {
        BasePage.WaitingForElementToBeVisible(middleNameUser);
        middleNameUser.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        middleNameUser.sendKeys(Keys.DELETE);
        middleNameUser.sendKeys(name);
        logger.debug("Edit User IN PIM Module: Set Middle Name User");
    }

    public void setLastNameUser(String name) {
        BasePage.WaitingForElementToBeVisible(lastNameUser);
        lastNameUser.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        lastNameUser.sendKeys(Keys.DELETE);
        lastNameUser.sendKeys(name);
        logger.debug("Edit User IN PIM Module: Set Last Name User");
    }

    public void setIdUser(String id){
        BasePage.WaitingForElementToBeVisible(idUser);
        idUser.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        idUser.sendKeys(Keys.DELETE);
        idUser.sendKeys(id);
        logger.debug("Edit User IN PIM Module: Set User ID");
    }

    public void setOtherIdUser(String otherid){
        BasePage.WaitingForElementToBeVisible(otherIdUser);
        otherIdUser.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        otherIdUser.sendKeys(Keys.DELETE);
        otherIdUser.sendKeys(otherid);
        logger.debug("Edit User IN PIM Module: Set Other ID'S");
    }

    public void setDriverLicenseNumber(String number){
        BasePage.WaitingForElementToBeVisible(driverLicenseNumber);
        driverLicenseNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        driverLicenseNumber.sendKeys(Keys.DELETE);
        driverLicenseNumber.sendKeys(number);
        logger.debug("Edit User IN PIM Module: Set Driver License Number");
    }

    public void setLicenceExpiryDate(String date){
        BasePage.WaitingForElementToBeVisible(licenceExpiryDate);
        licenceExpiryDate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        licenceExpiryDate.sendKeys(Keys.DELETE);
        licenceExpiryDate.sendKeys(date);
        logger.debug("Edit User IN PIM Module: Set Licence Expiry Date");
    }

    public void clickOnDropdownOfNationality(){
        BasePage.WaitingForElementToBeClickable(dropdownOfNationality);
        dropdownOfNationality.click();
        afghan.click();
        logger.debug("Edit User IN PIM Module: Click On Dropdown Of Nationality");
    }

    public void clickOnDropdownOfMatrialStatus(){
        BasePage.WaitingForElementToBeClickable(dropdownOfMatrialStatus);
        dropdownOfMatrialStatus.click();
        single.click();
        logger.debug("Edit User IN PIM Module: Click On Dropdown Of Matrial Status");
    }

    public void setDateOfBirth(String date){
        BasePage.WaitingForElementToBeVisible(dateOfBirth);
        dateOfBirth.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        dateOfBirth.sendKeys(Keys.DELETE);
        dateOfBirth.sendKeys(date);
        logger.debug("Edit User IN PIM Module: Set Date Of Birth");
    }

    public void setFemaleGender(){
        BasePage.WaitingForElementToBeClickable(femaleGender);
        if (!femaleGender.isSelected()){
            femaleGender.click();

        };
        logger.debug("Edit User IN PIM Module: Set Female Gender");
    }

    public void setMaleGender(){
        BasePage.WaitingForElementToBeClickable(maleGender);
        if(!maleGender.isSelected()){
            maleGender.click();
        }
        logger.debug("Edit User IN PIM Module: Set Male Gender");
    }

    public void clickOnPersonalInfoSaveButton(){
        BasePage.WaitingForElementToBeClickable(personalInfoSaveButton);
        personalInfoSaveButton.click();
        logger.debug("Edit User IN PIM Module: Click On Personal Info Save Button");
    }

    public String checkSaveVerificationPersonalInfo(){
        BasePage.WaitingForElementToBeVisible(saveVerifacationPersonalInfo);
        logger.debug("Edit User In PIM Module: Verifiaction of Save Message In Personal Info");
        return saveVerifacationPersonalInfo.getText();
    }

    public void clickOnDropdownOfBloodType(){
        BasePage.WaitingForElementToBeClickable(dropdownOfBloodType);
        dropdownOfBloodType.click();
        bloodType.click();
        logger.debug("Edit User IN PIM Module: Click On Dropdown Of Blood Type");
    }

    public void clickOnCustomFieldSaveButton(){
        BasePage.WaitingForElementToBeClickable(customFieldSaveButton);
        customFieldSaveButton.click();
        logger.debug("Edit User IN PIM Module: Click On Custom Field Save Button");
    }

    public String checkSaveVerificationCustomField(){
        BasePage.WaitingForElementToBeVisible(saveVerifacationCustomField);
        logger.debug("Edit User In PIM Module: Verifiaction of Save Message In Custom Field");
        return saveVerifacationCustomField.getText();
    }

    public void clickOnAddButton(){
        BasePage.WaitingForElementToBeClickable(addButton);
        addButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger.debug("Edit User IN PIM Module: Click On Add File Button");
    }

    public void uploadFile(String filePath) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BasePage.WaitingForElementToBeVisible(fileInput);
        fileInput.clear();
        fileInput.sendKeys(filePath);
        logger.debug("Edit User IN PIM Module: Upload File");
    }

    public void clickOnAddAttachmentSaveButton(){
        BasePage.WaitingForElementToBeClickable(addAttachmentSaveButton);
        addAttachmentSaveButton.click();
        logger.debug("Edit User IN PIM Module: Click On Add Attachment Save Button");
    }

    public String checkSaveVerificationaddAttachment(){
        BasePage.WaitingForElementToBeVisible(saveVerifacationAddAttachment);
        logger.debug("Edit User In PIM Module: Verifiaction of Save Message In Adding Attachment");
        return saveVerifacationAddAttachment.getText();
    }
}


