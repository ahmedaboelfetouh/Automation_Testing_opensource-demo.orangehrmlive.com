/******************************************************************************
 *
 * Module: Time
 *
 * File Name: TimeTest.java
 *
 * Description: Test for PunchIn Feature for Time Module
 *              Test for PunchOut Feature for Time Module
 *
 * Author: Ahmed Aboelfetouh
 *
 *******************************************************************************/
package Tests;

import Base.BaseTest;
import Pages.TimePage;
import Pages.LogInOutPage;

import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class TimeTest extends BaseTest {

    @Test(priority = 1)
    public void PunchInTest(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Punch In Test");
        TimePage time = new TimePage(driver);
        time.OpenTimeModule();
        time.OpenAttendanceMenu();
        time.OpenPunchInOutModule();
        time.SetPunchInData();
        time.SubmitPunchIn();
        assertEquals("Success",time.SuccessMessage());
        logger.debug("Time module ➡\uFE0F ✅✅✅ Punch In Test Completed Successfully");
    }
    
    @Test(priority = 2)
    public void PunchOutTest(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Punch Out Test");
        TimePage time = new TimePage(driver);
        time.OpenTimeModule();
        time.OpenAttendanceMenu();
        time.OpenPunchInOutModule();
        time.SetPunchOutData();
        time.SubmitPunchOut();
        assertEquals("Success",time.SuccessMessage());
        logger.debug("Time module ➡\uFE0F ✅✅✅ Punch out Test Completed Successfully");
    }

    @BeforeMethod
    public void Login(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login");
        LogInOutPage login = new LogInOutPage(driver);
        login.Login("Admin","admin123");
        logger.debug("Time module ➡\uFE0F ✅✅✅ Login Completed");
    }
}
