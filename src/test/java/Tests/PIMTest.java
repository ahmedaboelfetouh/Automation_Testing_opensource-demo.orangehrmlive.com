package Tests;

import Base.BaseTest;
import Pages.AddUserPIMPage;
import Pages.EditUserPIMPage;
import Pages.LogInOutPage;
import Pages.PIMPage;
import org.testng.annotations.Test;

import java.time.Duration;

public class PIMTest extends BaseTest {

    @Test
    public void addUserPIMTestCase() throws InterruptedException {
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        PIMPage pimObj = new PIMPage(driver);
        pimObj.clickOnPIMButton();
        pimObj.clickOnAddUserButton();

        AddUserPIMPage addUserPIMObj = new AddUserPIMPage(driver);
        addUserPIMObj.setFirstName("Aya");
        Thread.sleep(Duration.ofSeconds(5));
        addUserPIMObj.setMiddleName("Ali");
        Thread.sleep(Duration.ofSeconds(5));

        addUserPIMObj.setLastName("AbdELaal");
        Thread.sleep(Duration.ofSeconds(5));

        addUserPIMObj.setEmplyeeId("1005");
        Thread.sleep(Duration.ofSeconds(5));

        addUserPIMObj.clickOnSaveButton();
        Thread.sleep(Duration.ofSeconds(5));

    }


    @Test
    public void searchForEmployee(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        PIMPage pimObj = new PIMPage(driver);
        pimObj.clickOnPIMButton();

        pimObj.setEmployeeNameSearch("z");
        pimObj.clickOnSearchButton();
        pimObj.verifySearchResults();

    }


    @Test
    public void editUserTestCase(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        PIMPage pimObj = new PIMPage(driver);
        pimObj.clickOnPIMButton();
        pimObj.clickOnEditButton();

        EditUserPIMPage editPageObj = new EditUserPIMPage(driver);

        editPageObj.setFirstNameUser("Aya");
        editPageObj.setMiddleNameUser("Ali");
        editPageObj.setLastNameUser("AbdElaal");
        editPageObj.setIdUser("112");
        editPageObj.setOtherIdUser("322");
        editPageObj.setDriverLicenseNumber("222");
        editPageObj.setLicenceExpiryDate("2027-07-02");
        editPageObj.clickOnDropdownOfNationality();
        editPageObj.clickOnDropdownOfMatrialStatus();
        editPageObj.setDateOfBirth("2002-02-02");
        editPageObj.setFemaleGender();
        editPageObj.clickOnPersonalInfoSaveButton();

        editPageObj.clickOnDropdownOfBloodType();
        editPageObj.clickOnCustomFieldSaveButton();

//        editPageObj.clickOnAddButton();
//        editPageObj.uploadFile("C://Users/Aya Ali/Downloads/Aya Ali Cover Letter.pdf");
//        editPageObj.clickOnAddAttachmentSaveButton();
    }



}
