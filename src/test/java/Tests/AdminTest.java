package Tests;

import Base.BaseTest;
import Pages.AdminPage;
import Pages.EditUserPage;
import Pages.LogInOutPage;

import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class AdminTest extends BaseTest {

    @Test
    public void addUserTestCase() throws InterruptedException {
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Punch In Test");
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        AdminPage adminObj = new AdminPage(driver);
        adminObj.clickOnAdminButton();
        adminObj.cliCkOnAddButton();
        adminObj.selectUserRole();
        adminObj.selectStatusAsEnabled();
        adminObj.setEmployeeName();
        adminObj.setUserName("yomna123");
        adminObj.setEmployeePassword("Aya@12345");
        adminObj.setEmployeeConfirmPassword("Aya@12345");
        adminObj.clickOnSaveButton();
        adminObj.checkSaveVerification();
        //assertEquals("Success",);
        logger.debug("Time module ➡\uFE0F ✅✅✅ Punch In Test Completed Successfully");
    }


    @Test
    public void editUserTestCase() throws InterruptedException {
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        AdminPage adminObj = new AdminPage(driver);
        adminObj.clickOnAdminButton();
        adminObj.clickOnEditFun();
        EditUserPage editObj = new EditUserPage(driver);
        editObj.clickOnCheckbox();
        editObj.setEmployeePassword("Aya@12345");
        editObj.setEmployeeConfirmPassword("Aya@12345");
        editObj.clickOnSaveButton();
        editObj.checkSaveVerification();
    }


    @Test
    public void deleteUserTestCase() throws InterruptedException {
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        AdminPage adminObj = new AdminPage(driver);
        adminObj.clickOnAdminButton();
        Thread.sleep(Duration.ofSeconds(5));
        adminObj.clickOnDeleteButton();
        Thread.sleep(Duration.ofSeconds(5));
        adminObj.checkDeleteMessageVerification();
        Thread.sleep(Duration.ofSeconds(5));
        adminObj.clickOnDeleteButtonAlert();
    }

}

