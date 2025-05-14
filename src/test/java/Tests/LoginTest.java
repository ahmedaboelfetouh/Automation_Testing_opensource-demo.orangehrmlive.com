package Tests;

import Base.BaseTest;
import Pages.LoginPage;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @DataProvider(name = "LoginData")
    public Object[][] TestData(){
        return new Object[][]{
                {"Admin","admin123"},
                {"Admin","admin1234"},
                {"Admin","admin12345"},
                {"Admin","admin123456"},
                {"Admin","admin1234567"},
                {"Admin","admin12345678"},
                {"Admin","admin123456789"}
        };
    }
    @Test
    public void ValidLoginTest(){
        logger.info("\uD83D\uDE80 \uD83D\uDE80 \uD83D\uDE80 Starting Login Test");
        LoginPage login = new LoginPage(driver);
        login.Login("Admin","admin123");
        logger.debug("✅✅✅ Login Test Completed Successfully");

    }
    @Test(dataProvider = "LoginData")
    public void LoginWIthDifferData(String username,String password){
        logger.info("\uD83D\uDE80 \uD83D\uDE80 \uD83D\uDE80 Starting Login Test");
        LoginPage login = new LoginPage(driver);
        login.Login(username, password);
    }
}
