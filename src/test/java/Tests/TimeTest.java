package Tests;

import Base.BaseTest;
import Pages.TimePage;
import Pages.LogInOutPage;

import org.testng.annotations.*;

public class TimeTest extends BaseTest {

    @BeforeMethod
    public void Login(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login");
        LogInOutPage login = new LogInOutPage(driver);
        login.Login("Admin","admin123");
        logger.debug("Time module ➡\uFE0F ✅✅✅ Login Completed");
    }

    @Test
    public void PunchInTest(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Punch In Test in Time Module");
        TimePage time = new TimePage(driver);
        time.OpenTimeModule();
        time.OpenAttendanceMenu();
        time.OpenPunchInOutModule();
        time.SetPunchInData();
        time.SubmitPunchIn();
        logger.debug("Time module ➡\uFE0F ✅✅✅ Punch In Test Completed Successfully");
    }

    @Test
    public void PunchOutTest(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Punch Out Test in Time Module");
        TimePage time = new TimePage(driver);
        time.OpenTimeModule();
        time.OpenAttendanceMenu();
        time.OpenPunchInOutModule();
        time.SetPunchOutData();
        time.SubmitPunchOut();
        logger.debug("Time module ➡\uFE0F ✅✅✅ Punch out Test Completed Successfully");
    }

    @AfterMethod
    public void Logout(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Login Out");
        LogInOutPage login = new LogInOutPage(driver);
        login.Logout();
        logger.debug("Time module ➡\uFE0F ✅✅✅ Logout Completed");
    }
}
