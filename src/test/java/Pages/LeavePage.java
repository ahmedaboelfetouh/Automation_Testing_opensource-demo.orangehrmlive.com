package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeavePage extends BasePage {

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(3) > a")
    private WebElement leaveButtom;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > input")
    private WebElement fromDate;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > input")
    private WebElement toDate;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(3) > div > div:nth-child(2) > div > div.oxd-select-text.oxd-select-text--active > div.oxd-select-text--after > i")
    private WebElement showWithLeaveWithStatus;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Rejected']")
    private WebElement rejected;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement leaveType;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='CAN - Vacation']")
    private WebElement vacation;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > input")
    private WebElement employeeName;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement sub_Unit;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Engineering']")
    private WebElement engineering;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(2) > div > div.oxd-grid-item.oxd-grid-item--gutters.orangehrm-leave-filter.--span-column-2 > div > label > input[type=checkbox]")
    private WebElement includePastEmployeescheck;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement searchButton;
    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div")
    private List<WebElement> resultVacations;

    public LeavePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLeaveButton(){
        BasePage.WaitingForElementToBeVisible(leaveButtom);
        leaveButtom.click();
        logger.debug("Search User In Leave Module: Click On Leave Button");
    }

    public void setFromDate(String date) {
        BasePage.WaitingForElementToBeVisible(fromDate);
        fromDate.sendKeys(date);
        logger.debug("Search User In Leave Module: Set From Date");
    }

    public void setToDate(String date) {
        BasePage.WaitingForElementToBeVisible(toDate);
        toDate.sendKeys(date);
        logger.debug("Search User In Leave Module: Set To Date");
    }

    public void setShowWithLeaveWithStatus() {
        BasePage.WaitingForElementToBeClickable(showWithLeaveWithStatus);
        showWithLeaveWithStatus.click();
        rejected.click();
        logger.debug("Search User In Leave Module: Set Show With Leave With Status");
    }

    public void setLeaveType() {
        BasePage.WaitingForElementToBeClickable(leaveType);
        leaveType.click();
        vacation.click();
        logger.debug("Search User In Leave Module: Set Leave Type");
    }

    public void setEmployeeName(String name){
        BasePage.WaitingForElementToBeVisible(employeeName);
        employeeName.sendKeys(name);
        logger.debug("Search User In Leave Module: Set Employee Name");
    }

    public void setSub_Unit() {
        BasePage.WaitingForElementToBeClickable(sub_Unit);
        sub_Unit.click();
        engineering.click();
        logger.debug("Search User In Leave Module: Set Sub Unit");
    }

    public void setIncludePastEmployeescheck(){
        BasePage.WaitingForElementToBeVisible(includePastEmployeescheck);
        if (!includePastEmployeescheck.isSelected()){
            includePastEmployeescheck.click();
        }
        logger.debug("Search User In Leave Module: Set Include Past Employees check");
    }

    public void clickOnSearchButton(){
        BasePage.WaitingForElementToBeClickable(searchButton);
        searchButton.click();
        logger.debug("Search User In Leave Module: Click On Search Button");

    }

    private void waitForResults() {
        try {
            wait.until(driver -> !resultVacations.isEmpty() ||
                    driver.findElement(By.cssSelector(".oxd-text--span")).getText().contains("No Records Found"));
        } catch (Exception e) {
            System.out.println("Error waiting for results: " + e.getMessage());
        }
    }

    public void verifySearchResults() {
        waitForResults();
        System.out.println("After Search: " + resultVacations.size());
        logger.debug("Search User In Leave Module: Verification Of Search Results");
    }
}
