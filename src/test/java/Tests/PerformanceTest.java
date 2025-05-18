/******************************************************************************
 *
 * Module: Performance
 *
 * File Name: PerformanceTest.java
 *
 * Description: Test for Add APK Feature for Performance Module
 *              Test for Search for a created APK Feature for Performance Module
 *
 * Author: Ahmed Aboelfetouh
 *
 *******************************************************************************/
package Tests;

import Base.BaseTest;
import Pages.LogInOutPage;

import Pages.PerformancePage;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class PerformanceTest extends BaseTest {

    @Test(priority = 1)
    public void AddAPKTest(){
        logger.info("Performance Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Add APK Test");
        PerformancePage performance = new PerformancePage(driver);
        performance.OpenPerformanceModule();
        performance.OpenConfigureKPI();
        performance.AddKPI();
        assertEquals("Success",performance.SuccessMessage());
        logger.debug("Performance module ➡\uFE0F ✅✅✅ Add KPI Test Completed Successfully");
    }

    @Test(priority = 2)
    public void SearchForKPITest() throws InterruptedException {
        logger.info("Performance Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting for KPI Test");
        PerformancePage performance = new PerformancePage(driver);
        performance.OpenPerformanceModule();
        performance.OpenConfigureKPI();
        performance.APKSearch();
        logger.debug("Performance module ➡\uFE0F ✅✅✅ Searchfor KPI KPI Test Completed Successfully");
    }

    @BeforeMethod
    public void Login(){
        logger.info("Performance Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login");
        LogInOutPage login = new LogInOutPage(driver);
        login.Login("Admin","admin123");
        logger.debug("Performance module ➡\uFE0F ✅✅✅ Login Completed");
    }


}
