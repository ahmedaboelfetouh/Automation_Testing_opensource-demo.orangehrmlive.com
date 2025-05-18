package Tests;

import Base.BaseTest;
import Pages.AdminPage;
import Pages.EditUserPage;
import Pages.LogInOutPage;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class AdminTest extends BaseTest {



    @Test
    public void addUserTestCase() throws InterruptedException {
        logger.info("Admin Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Add User Test");

        LogInOutPage logObj = new LogInOutPage(driver);

        logObj.Login("Admin","admin123");
        AdminPage adminObj = new AdminPage(driver);

        Faker faker = new Faker();
        String userNmae = faker.name().firstName();
        String userNmae2 = faker.name().lastName();

        adminObj.clickOnAdminButton();
        adminObj.cliCkOnAddButton();
        adminObj.selectUserRole();
        adminObj.selectStatusAsEnabled();
        adminObj.setEmployeeName();
        adminObj.setUserName(userNmae+userNmae2);
        Thread.sleep(Duration.ofSeconds(10));

        adminObj.setEmployeePassword("Aya@12345");
        adminObj.setEmployeeConfirmPassword("Aya@12345");
        adminObj.clickOnSaveButton();
        assertEquals("Success",adminObj.checkSaveVerification());

        logger.debug("Admin module ➡\uFE0F ✅✅✅ Add User Test Completed Successfully");
    }

    @Test
    public void editUserTestCase() throws InterruptedException {
        logger.info("Admin Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Edit User Test");

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
        assertEquals("Success",editObj.checkSaveVerification());

        logger.debug("Admin module ➡\uFE0F ✅✅✅ Edit User Test Completed Successfully");
    }

    @Test
    public void deleteUserTestCase() throws InterruptedException {
        logger.info("Admin Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Delete User Test");

        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        AdminPage adminObj = new AdminPage(driver);

        adminObj.clickOnAdminButton();
        adminObj.clickOnDeleteButton();
        adminObj.clickOnDeleteButtonAlert();
        assertEquals("Success",adminObj.checkDeleteMessageVerification());

        logger.debug("Admin module ➡\uFE0F ✅✅✅ Delete User Test Completed Successfully");
    }
}

