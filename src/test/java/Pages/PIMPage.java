package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PIMPage extends BasePage {

    private String searchData;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(2) > a")
    private WebElement pimButtom;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button")
    private WebElement addUserButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-row > div > div:nth-child(1) > div > div:nth-child(2) > div > div > input")
    private WebElement employeeNameSearch;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div")
    private List<WebElement> resultEmployees;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement searchButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(1) > div > div:nth-child(9) > div > button:nth-child(1)")
    private WebElement editButton;

    public PIMPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPIMButton(){
        BasePage.WaitingForElementToBeVisible(pimButtom);
        pimButtom.click();
        logger.debug("PIM Module: Click On PIM Button");
    }

    public void clickOnAddUserButton(){
        BasePage.WaitingForElementToBeVisible(addUserButton);
        addUserButton.click();
        logger.debug("Add User In PIM Module: Click On Add User Button");
    }

    public void setEmployeeNameSearch(String value) {
        searchData = value.toLowerCase();
        BasePage.WaitingForElementToBeVisible(employeeNameSearch);
        employeeNameSearch.clear();
        employeeNameSearch.sendKeys(value);
        logger.debug("PIM Module: Set Employee Name Search");
        System.out.println("Before Search: " + resultEmployees.size()+ " Of Employees");
    }

    private void waitForResults() {
        try {
            wait.until(driver -> !resultEmployees.isEmpty() ||
                    driver.findElement(By.cssSelector(".oxd-text--span")).getText().contains("No Records Found"));
        } catch (Exception e) {
            System.out.println("Error waiting for results: " + e.getMessage());
        }
    }

    public void verifySearchResults() {
        waitForResults();
        System.out.println("After Search: " + resultEmployees.size()+ " Of Employees");
    }

    public void clickOnSearchButton() {
        BasePage.WaitingForElementToBeVisible(searchButton);
        searchButton.click();
        logger.debug("Search About User PIM Module: Click On Search Button");
    }

    public void clickOnEditButton(){
        BasePage.WaitingForElementToBeClickable(editButton);
        editButton.click();
        logger.debug("PIM Module: Click On Edit Button");
    }

}

