

package Tests;

import Base.BasePage;
import Base.BaseTest;
import Pages.LeavePage;
import Pages.LogInOutPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LeavePageTest extends BaseTest {


    @Test
    public void resultVacationSearchedTestCase(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        LeavePage leaveObj = new LeavePage(driver);
        leaveObj.clickOnLeaveButton();

        leaveObj.setShowWithLeaveWithStatus();
        leaveObj.clickOnSearchButton();
        leaveObj.verifySearchResults();
    }

}

