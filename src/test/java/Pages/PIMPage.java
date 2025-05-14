package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PIMPage extends BasePage {

    public PIMPage(WebDriver driver) {
        super(driver);
    }

    private String searchData;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(2) > a")
    private WebElement pimButtom;

    public void clickOnPIMButton(){
        BasePage.WaitingForElement(pimButtom);
        pimButtom.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button")
    private WebElement addUserButton;

    public void clickOnAddUserButton(){
        BasePage.WaitingForElement(addUserButton);
        addUserButton.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-row > div > div:nth-child(1) > div > div:nth-child(2) > div > div > input")
    private WebElement employeeNameSearch;

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div")
    private List<WebElement> resultEmployees;


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement searchButton;

    public void setEmployeeNameSearch(String value) {
        searchData = value.toLowerCase();
        BasePage.WaitingForElement(employeeNameSearch);
        employeeNameSearch.clear();
        employeeNameSearch.sendKeys(value);
        System.out.println("Before Search: " + resultEmployees.size());


    }

    private void waitForResults() {
        try {
            // Wait for either results to appear or "No Records Found" message
            wait.until(driver -> !resultEmployees.isEmpty() ||
                    driver.findElement(By.cssSelector(".oxd-text--span")).getText().contains("No Records Found"));
        } catch (Exception e) {
            System.out.println("Error waiting for results: " + e.getMessage());
        }
    }

    public void verifySearchResults() {
        waitForResults();
        System.out.println("After Search: " + resultEmployees.size());
    }

    public void clickOnSearchButton() {
        BasePage.WaitingForElement(searchButton);
        searchButton.click();
    }

}

