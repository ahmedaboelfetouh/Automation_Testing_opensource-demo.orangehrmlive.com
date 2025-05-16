package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[1]/button")
    private WebElement assignLeave;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[2]/button")
    private WebElement leaveList;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[3]/button")
    private WebElement timeSheets;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[4]/button")
    private WebElement applyLeave;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[6]/div/div[2]/div/ul/li[1]/span[2]")
    private WebElement engineeringDashboard;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[6]/div/div[2]/div/ul/li[4]/span[2]")
    private WebElement clientServicesDashboard;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[6]/div/div[2]/div/ul/li[5]/span[2]")
    private WebElement unassignedDashboard;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[6]/div/div[2]/div/ul/li[2]/span[2]")
    private WebElement hrDashboard;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[7]/div/div[2]/div/ul/li[3]/span[2]")
    private WebElement unassignedDashboard2;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[7]/div/div[2]/div/ul/li[2]/span[2]")
    private WebElement newYorkSalesOfficeDashboard2;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[7]/div/div[2]/div/ul/li[1]/span[2]")
    private WebElement texasRDDashboard2;
    public void redirectToAssignLeaveTab(){
        BasePage.WaitingForElementToBeVisible(assignLeave);
        assignLeave.click();
    }
    public void redirectToLeaveList(){
        BasePage.WaitingForElementToBeVisible(leaveList);
        leaveList.click();
    }
    public void redirectToTimeSheetsTab(){
        BasePage.WaitingForElementToBeVisible(timeSheets);
        timeSheets.click();
    }
    public void redirectToApplyLeaveTab(){
        BasePage.WaitingForElementToBeVisible(applyLeave);
        applyLeave.click();
    }
    public void dashboardEmployeeDistributionSubUnit(){
        BasePage.WaitingForElementToBeVisible(unassignedDashboard);
        unassignedDashboard.click();
        engineeringDashboard.click();
        hrDashboard.click();
        clientServicesDashboard.click();
        engineeringDashboard.click();
        unassignedDashboard.click();

    }
    public void dashboardEmployeeDistributionLocation(){
        BasePage.WaitingForElementToBeVisible(unassignedDashboard2);
        unassignedDashboard2.click();
        newYorkSalesOfficeDashboard2.click();
        texasRDDashboard2.click();
        unassignedDashboard2.click();
        unassignedDashboard2.click();

    }

}
