package Tests;

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
        LoginPage login = new LoginPage(driver);
        login.Login("Admin","admin123");
    }
    @Test(dataProvider = "LoginData")
    public void LoginWIthDifferData(String username,String password){
        LoginPage login = new LoginPage(driver);
        login.Login(username, password);
    }
}
