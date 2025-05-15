package Tests;



import Base.BaseTest;
import Pages.LogInOutPage;

import Pages.PerformancePage;
import org.testng.annotations.*;

public class PerformanceTest extends BaseTest {

    @Test
    public void AddAPKTest(){
        logger.info("Performance Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Add APK Test in Performance Module");
        PerformancePage performance = new PerformancePage(driver);
        performance.OpenPerformanceModule();
        performance.OpenConfigureKPI();
        performance.AddKPI();
        logger.debug("Performance module ➡\uFE0F ✅✅✅ Add KPI Test Completed Successfully");
    }

    @Test
    public void SearchforKPITest(){
        logger.info("Performance Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting for KPI Test in Performance Module");
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

    @AfterMethod
    public void Logout(){
        logger.info("Performance Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Login Out");
        LogInOutPage login = new LogInOutPage(driver);
        login.Logout();
        logger.debug("Performance module ➡\uFE0F ✅✅✅ Logout Completed");
    }
}
