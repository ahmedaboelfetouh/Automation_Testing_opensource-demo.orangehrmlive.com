package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Steps.Hooks.driver;

public class LoginSteps {
    WebDriver driver = Hooks.driver;
    LoginPage loginpage = new LoginPage(driver);
    @Given("user in login page")
    public void user_in_login_page() {
        System.out.println("User is on the login page");
    }

    @When("user enters {string} and {string}")
    public void SetCreditials(String username, String password) {
        loginpage.SetUserName(username);
        loginpage.SetPassword(password);
    }

    @And("user clicks on login button")
    public void ClickLoginButton() {
        loginpage.ClickButton();
    }

    @Then("show message successfully registered")
    public void ShowMessage() {
        System.out.println("User is successfully registered");
    }
}
