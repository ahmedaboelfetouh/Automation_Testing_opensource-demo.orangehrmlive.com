package Tests;

import Base.BaseTest;
import Pages.AddUserPIMPage;
import Pages.EditUserPIMPage;
import Pages.LogInOutPage;
import Pages.PIMPage;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class PIMTest extends BaseTest {

    @Test
    public void addUserPIMTestCase() throws InterruptedException {
        logger.info("PIM Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Add User Test");

        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        PIMPage pimObj = new PIMPage(driver);
        pimObj.clickOnPIMButton();
        pimObj.clickOnAddUserButton();

        AddUserPIMPage addUserPIMObj = new AddUserPIMPage(driver);
        addUserPIMObj.setFirstName("Aya");
        addUserPIMObj.setMiddleName("Ali");
        addUserPIMObj.setLastName("Abdo");
        addUserPIMObj.setEmplyeeId("1007");/////edit it

        addUserPIMObj.createLoginDetailsFun();

        addUserPIMObj.setUserName("ayaali2003");/////edit it
        addUserPIMObj.enableButton();
        addUserPIMObj.setEmployeePassword("aayyaa123");
        addUserPIMObj.setEmployeeConfirmPassword("aayyaa123");

        addUserPIMObj.clickOnSaveButton();
        assertEquals("Success",addUserPIMObj.checkSaveVerification());

        logger.debug("PIM module ➡\uFE0F ✅✅✅ Add User Test Completed Successfully");
    }


    @Test
    public void searchForEmployee(){
        logger.info("PIM Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Search User Test");

        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        PIMPage pimObj = new PIMPage(driver);
        pimObj.clickOnPIMButton();

        pimObj.setEmployeeNameSearch("z");
        pimObj.clickOnSearchButton();
        pimObj.verifySearchResults();

        logger.debug("PIM module ➡\uFE0F ✅✅✅ Search User Test Completed Successfully");
    }


    @Test
    public void editUserTestCase(){
        logger.info("PIM Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Edit User Test");

        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        PIMPage pimObj = new PIMPage(driver);
        pimObj.clickOnPIMButton();
        pimObj.clickOnEditButton();

        EditUserPIMPage editPageObj = new EditUserPIMPage(driver);

        editPageObj.setFirstNameUser("Aya");
        editPageObj.setMiddleNameUser("Ali");
        editPageObj.setLastNameUser("AbdElaal");
        editPageObj.setIdUser("132");//////// edit it
        editPageObj.setOtherIdUser("322");
        editPageObj.setDriverLicenseNumber("222");
        editPageObj.setLicenceExpiryDate("2027-07-02");
        editPageObj.clickOnDropdownOfNationality();
        editPageObj.clickOnDropdownOfMatrialStatus();
        editPageObj.setDateOfBirth("2002-02-02");
        editPageObj.setFemaleGender();
        editPageObj.clickOnPersonalInfoSaveButton();
        assertEquals("Success",editPageObj.checkSaveVerificationPersonalInfo());


        editPageObj.clickOnDropdownOfBloodType();
        editPageObj.clickOnCustomFieldSaveButton();
        assertEquals("Success",editPageObj.checkSaveVerificationCustomField());


//        editPageObj.clickOnAddButton();
//        editPageObj.uploadFile("C://Users/Aya Ali/Downloads/Aya Ali Cover Letter.pdf");
//        editPageObj.clickOnAddAttachmentSaveButton();

        logger.debug("PIM module ➡\uFE0F ✅✅✅ Edit User Test Completed Successfully");
    }
}
