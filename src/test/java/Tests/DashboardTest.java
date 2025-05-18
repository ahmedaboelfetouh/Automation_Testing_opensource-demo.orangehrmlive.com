package Tests;

import Base.BasePage;
import Base.BaseTest;
import Pages.DashboardPage;
import Pages.LogInOutPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {
    @Test
    public void verifyRedirectToAssignLeaveTab(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.redirectToAssignLeaveTab();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave");
    }
    @Test
    public void verifyRedirectToLeaveList(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.redirectToLeaveList();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
    }
    @Test
    public void verifyRedirectToTimeSheetsTab(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.redirectToTimeSheetsTab();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
    }
    @Test
    public void VerifyRedirectToApplyLeaveTab() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        dashboardPage.redirectToApplyLeaveTab();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave");
    }
    @Test
    public void dashboardEmployeeDistributionSubUnitTest(){
        DashboardPage dashboardPage = new DashboardPage(driver);
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        dashboardPage.dashboardEmployeeDistributionSubUnit();
    }
    @Test
    public void dashboardEmployeeDistributionLocationTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        dashboardPage.dashboardEmployeeDistributionLocation();
    }

}
