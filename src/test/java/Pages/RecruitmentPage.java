package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitmentPage extends BasePage
{

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
    WebElement RecruitmentButton;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div")
    WebElement JobTitle;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    WebElement Vacancy;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    WebElement HiringManager;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")
    WebElement Status;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")
    WebElement CandidateName;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/input")
    WebElement Keywords;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/input")
    WebElement FromDate;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div/input")
    WebElement ToDate;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/div/div/div/div[2]/div/div/div[1]")
    WebElement MethodOfApplication;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[1]")
    WebElement ResetButton;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]")
    WebElement SearchButton;


    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    WebElement RecordsFound;

    public RecruitmentPage(WebDriver driver)
    {
        super(driver);
    }


    public void ClickOnRecruitmentButton(){
        BasePage.WaitingForElementToBeVisible(RecruitmentButton);
        RecruitmentButton.click();
    }
    public void SetJobTitle(String jobTitle)
    {
        BasePage.WaitingForElementToBeVisible(JobTitle);
        JobTitle.click();

        JobTitle.sendKeys(jobTitle);
    }

    public void SetVacancy(String vacancy)
    {
        BasePage.WaitingForElementToBeVisible(Vacancy);

        Vacancy.sendKeys(vacancy);
    }

    public void SetHiringManager(String hiringManager)
    {
        BasePage.WaitingForElementToBeVisible(HiringManager);

        HiringManager.sendKeys(hiringManager);
    }

    public void SetStatus(String status)
    {
        BasePage.WaitingForElementToBeVisible(Status);

        Status.sendKeys(status);
    }

    public void SetCandidateName(String candidateName)
    {
        BasePage.WaitingForElementToBeVisible(CandidateName);

        CandidateName.sendKeys(candidateName);
    }

    public void SetKeywords(String keywords)
    {
        BasePage.WaitingForElementToBeVisible(Keywords);

        Keywords.sendKeys(keywords);
    }

    public void SetFromDate(String fromDate)
    {
        BasePage.WaitingForElementToBeVisible(FromDate);

        FromDate.sendKeys(fromDate);
    }

    public void SetToDate(String toDate)
    {
        BasePage.WaitingForElementToBeVisible(ToDate);

        ToDate.sendKeys(toDate);
    }

    public void SetMethodOfApplication(String method)
    {
        BasePage.WaitingForElementToBeVisible(MethodOfApplication);

        MethodOfApplication.sendKeys(method);
    }

    public void ClickReset()
    {
        ResetButton.click();
    }

    public void ClickSearch()
    {
        SearchButton.click();
    }

    public String CheckRecordsVisibility()
    {
        BasePage.WaitingForElementToBeVisible(RecordsFound);
        RecordsFound.isDisplayed();
        String RecordsWord = RecordsFound.getText();
        return RecordsWord;
    }

    public void SearchForCandidate(String jobTitle, String vacancy, String hiringManager, String status, String candidateName, String keywords, String fromDate, String toDate, String method)
    {
        SetJobTitle(jobTitle);
        SetVacancy(vacancy);
        SetHiringManager(hiringManager);
        SetStatus(status);
        SetCandidateName(candidateName);
        SetKeywords(keywords);
        SetFromDate(fromDate);
        SetToDate(toDate);
        SetMethodOfApplication(method);
    }




}