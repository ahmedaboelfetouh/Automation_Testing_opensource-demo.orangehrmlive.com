package Tests;

import Base.BaseTest;
import Pages.LogInOutPage;
import Pages.MyInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyInfoPageTest extends BaseTest
{
    @Test
    public void ValidEditTestCase()
    {
        logger.info("My Info Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login For Valid Edit TestCase");
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        MyInfoPage MyInfoObj = new MyInfoPage(driver);
        MyInfoObj.CheckEditDetails("Na","Fm");

        logger.debug("My Info module ➡\uFE0F ✅✅✅ Valid Edit TestCase Completed");
    }
}
