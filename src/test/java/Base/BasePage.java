package Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait ;
    protected static final Logger logger = LogManager.getLogger(BasePage.class);

   public BasePage(WebDriver driver){
        BasePage.driver = driver;
        PageFactory.initElements(driver ,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void WaitingForElementToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static void WaitingForElementToBeClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
