package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
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

    public void SetUserName(String username){
        BasePage.WaitingForElement(Username);
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
    }
}
