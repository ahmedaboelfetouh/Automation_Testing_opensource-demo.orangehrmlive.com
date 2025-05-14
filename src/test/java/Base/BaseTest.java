package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver = BasePage.driver;
    public ChromeOptions options;

    @BeforeClass
    public  void Setup(){

        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.addArguments("--ignore-certificate-errors");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
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
