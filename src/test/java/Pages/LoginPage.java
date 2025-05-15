package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.AssertJUnit.assertEquals;


public class LoginPage extends BasePage {
    WebDriverWait wait = BasePage.wait;

    public LoginPage(WebDriver driver){
        super(driver);

    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement Username;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement LoginButton;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6")
    WebElement HomePageLabel;

    public void SetUserName(String username){
        BasePage.WaitingForElementToBeVisible(Username);
        Username.clear();
        Username.sendKeys(username);
    }

    public void SetPassword(String password){
        Password.clear();
        Password.sendKeys(password);
    }

    public void ClickButton(){

        LoginButton.click();
    }

    public void Login(String username,String password){
        SetUserName(username);
        SetPassword(password);
        ClickButton();
        BasePage.WaitingForElementToBeVisible(HomePageLabel);
        assertEquals(HomePageLabel.getText(), "Dashboard");
    }
}
