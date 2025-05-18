package Base;

import Pages.LogInOutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.CookiePolicy;

public class BaseTest {
    protected WebDriver driver = BasePage.driver;
    protected ChromeOptions options;
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeClass
    public  void Setup(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.addArguments("--ignore-certificate-errors");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        logger.info("✅ Driver Setup Successfully");
        logger.info("✅ Browser Opened Successfully Successfully");
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void OpenUrl(){
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
        logger.info("✅ Navigated to the site successfully");
    }

    @AfterMethod
    public void Logout(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Login Out");
        LogInOutPage login = new LogInOutPage(driver);
        login.Logout();
        logger.debug("Time module ➡\uFE0F ✅✅✅ Logout Completed");
    }


    @AfterClass
    public void CloseBrowser(){
        driver.manage().deleteAllCookies();
        driver.quit();
        logger.info("✅ Browser Closed Successfully");
    }
}
