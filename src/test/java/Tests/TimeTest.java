package Tests;

import Base.BaseTest;
import Pages.TimePage;
import Pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeTest extends BaseTest {

    @BeforeMethod
    public void Login(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login");
        LoginPage login = new LoginPage(driver);
        login.Login("Admin","admin123");
        logger.debug("Time module ➡\uFE0F ✅✅✅ Login Completed");
    }

    @Test
    public void PunchInOutTest(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Punch In/Out Test in Time Module");
        TimePage time = new TimePage(driver);
        time.OpenTimeModule();
        time.OpenAttendanceMenu();
        time.OpenPunchInOutModule();
        logger.debug("Time module ➡\uFE0F ✅✅✅ Punch In/out Test Completed Successfully");
    }
    @Test
    public void ViewAttendanceRecordsTest(String username,String password){
        logger.info("\uD83D\uDE80 \uD83D\uDE80 \uD83D\uDE80 Starting Invalid Login Test");


        logger.debug("✅✅✅ Invalid Login Test Completed Successfully");
    }
}
