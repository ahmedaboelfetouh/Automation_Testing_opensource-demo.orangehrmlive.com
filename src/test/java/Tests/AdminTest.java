package Tests;

import Base.BaseTest;
import Pages.AdminPage;
import Pages.EditUserPage;
import Pages.LogInOutPage;

import org.testng.annotations.Test;

public class AdminTest extends BaseTest {

    @Test
    public void addUserTestCase(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        AdminPage adminObj = new AdminPage(driver);
        adminObj.clickOnAdminButton();
        adminObj.cliCkOnAddButton();
        adminObj.selectUserRole();
        adminObj.selectStatusAsEnabled();
        adminObj.setEmployeeName("Besant Technologies");
        adminObj.setUserName("ayaali");
        adminObj.setEmployeePassword("Aya@12345");
        adminObj.setEmployeeConfirmPassword("Aya@12345");
        adminObj.clickOnSaveButton();
    }


    @Test
    public void editUserTestCase(){
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
    }


    @Test
    public void deleteUserTestCase(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        AdminPage adminObj = new AdminPage(driver);
        adminObj.clickOnAdminButton();
        adminObj.clickOnDeleteButton();
    }

}

