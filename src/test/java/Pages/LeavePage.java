package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeavePage extends BasePage {
    public LeavePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(3) > a")
    private WebElement leaveButtom;

    public void clickOnLeaveButton(){
        BasePage.WaitingForElementToBeVisible(leaveButtom);
        leaveButtom.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > input")
    private WebElement fromDate;

    public void setFromDate(String date) {
        BasePage.WaitingForElementToBeVisible(fromDate);
        fromDate.sendKeys(date);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > input")
    private WebElement toDate;

    public void setToDate(String date) {
        BasePage.WaitingForElementToBeVisible(toDate);
        toDate.sendKeys(date);
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(3) > div > div:nth-child(2) > div > div.oxd-select-text.oxd-select-text--active > div.oxd-select-text--after > i")
    private WebElement showWithLeaveWithStatus;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Rejected']")
    private WebElement rejected;

    public void setShowWithLeaveWithStatus() {
        BasePage.WaitingForElementToBeClickable(showWithLeaveWithStatus);
        showWithLeaveWithStatus.click();
        rejected.click();
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement leaveType;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='CAN - Vacation']")
    private WebElement vacation;

    public void setLeaveType() {
        BasePage.WaitingForElementToBeClickable(leaveType);
        leaveType.click();
        vacation.click();
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > input")
    private WebElement employeeName;

    public void setEmployeeName(String name){
        BasePage.WaitingForElementToBeVisible(employeeName);
        employeeName.sendKeys(name);
    }

    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i")
    private WebElement sub_Unit;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Engineering']")
    private WebElement engineering;

    public void setSub_Unit() {
        BasePage.WaitingForElementToBeClickable(sub_Unit);
        sub_Unit.click();
        engineering.click();
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(2) > div > div.oxd-grid-item.oxd-grid-item--gutters.orangehrm-leave-filter.--span-column-2 > div > label > input[type=checkbox]")
    private WebElement includePastEmployeescheck;

    public void setIncludePastEmployeescheck(){
        BasePage.WaitingForElementToBeVisible(includePastEmployeescheck);
        if (!includePastEmployeescheck.isSelected()){
            includePastEmployeescheck.click();
        }
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    private WebElement searchButton;

    public void clickOnSearchButton(){
        BasePage.WaitingForElementToBeClickable(searchButton);
        searchButton.click();
    }


    @FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div")
    private List<WebElement> resultVacations;

    private void waitForResults() {
        try {
            // Wait for either results to appear or "No Records Found" message
            wait.until(driver -> !resultVacations.isEmpty() ||
                    driver.findElement(By.cssSelector(".oxd-text--span")).getText().contains("No Records Found"));
        } catch (Exception e) {
            System.out.println("Error waiting for results: " + e.getMessage());
        }
    }

    public void verifySearchResults() {
        waitForResults();
        System.out.println("After Search: " + resultVacations.size());
    }

}
