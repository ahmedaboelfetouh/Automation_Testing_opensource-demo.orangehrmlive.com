

package Tests;

import Base.BasePage;
import Base.BaseTest;
import Pages.LeavePage;
import Pages.LogInOutPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LeavePageTest extends BaseTest {


    @Test
    public void resultVacationSearchedTestCase() throws InterruptedException {
        logger.info("Leave Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Search Leave Test");

        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        LeavePage leaveObj = new LeavePage(driver);
        leaveObj.clickOnLeaveButton();

        leaveObj.setShowWithLeaveWithStatus();
        leaveObj.clickOnSearchButton();
        leaveObj.verifySearchResults();

        logger.debug("Leave module ➡\uFE0F ✅✅✅ Search Leave Test Completed Successfully");
    }
}

