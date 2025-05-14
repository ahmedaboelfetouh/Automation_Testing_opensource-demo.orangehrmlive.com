package Tests;

import Base.BaseTest;
import Pages.AddUserPIMPage;
import Pages.LoginPage;
import Pages.PIMPage;
import org.testng.annotations.Test;

public class PIMPageTest extends BaseTest {

    @Test
    public void addUserPIMTestCase(){
        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");

        PIMPage pimObj = new PIMPage(driver);
        pimObj.clickOnPIMButton();
        pimObj.clickOnAddUserButton();

        AddUserPIMPage addUserPIMObj = new AddUserPIMPage(driver);
        addUserPIMObj.setFirstName("Aya");
        addUserPIMObj.setMiddleName("Ali");
        addUserPIMObj.setLastName("AbdELaal");
        addUserPIMObj.setEmplyeeId("1005");
        addUserPIMObj.clickOnSaveButton();
    }


    @Test
    public void searchForEmployee(){
        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");

        PIMPage pimObj = new PIMPage(driver);
        pimObj.clickOnPIMButton();

        pimObj.setEmployeeNameSearch("z");
        pimObj.clickOnSearchButton();
        pimObj.verifySearchResults();

    }


}
