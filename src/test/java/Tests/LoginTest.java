package Tests;

import Base.BaseTest;
import Pages.LogInOutPage;


import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    public void ValidLoginTest(){
        logger.info("\uD83D\uDE80 \uD83D\uDE80 \uD83D\uDE80 Starting Login Test");
        LogInOutPage login = new LogInOutPage(driver);
        login.Login("Admin","admin123");
        logger.debug("✅✅✅ Login Test Completed Successfully");
    }
}
