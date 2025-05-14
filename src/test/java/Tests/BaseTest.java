package Tests;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver = BasePage.driver;
    @BeforeClass
    public  void Setup(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    }

    @BeforeMethod
    public void OpenUrl(){
        driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @AfterClass
    public void CloseBrowser(){
        driver.quit();
    }

    @BeforeMethod
    public void ClearCookies(){
        driver.manage().deleteAllCookies();
    }
}
