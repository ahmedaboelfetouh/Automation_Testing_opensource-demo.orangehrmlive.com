package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitmentPage extends BasePage
{

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
    WebElement RecruitmentButton;

    @FindBy(css= "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div")
    WebElement JobTitle;
    @FindBy(xpath = "//div[@role='listbox']//span[text()='Automaton Tester']")
    WebElement JobTitleValue;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    WebElement Vacancy;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Junior Account Assistant']")
    WebElement VacancyValue;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    WebElement HiringManager;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='ADMIN admin']")
    WebElement HiringManagerValue;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")
    WebElement Status;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Application Initiated']")
    WebElement StatusValue;

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

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Manual']")
    WebElement MethodOfApplicationValue;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[1]")
    WebElement ResetButton;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]")
    WebElement SearchButton;


    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    WebElement AddButton;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    WebElement RecordsFound;

    public RecruitmentPage(WebDriver driver)
    {
        super(driver);
        logger.info("Recruitment Page Object Created...");
    }



    public void ClickOnRecruitmentButton()
    {
        try
        {
            logger.trace("Trying to Find Recruitment Button");
            BasePage.WaitingForElementToBeVisible(RecruitmentButton);
            RecruitmentButton.click();
            logger.debug("Recruitment Button is Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception :Recruitment Button", e);
        }

    }
    public void SetJobTitle()
    {
        try
        {
            logger.trace("Trying to Find Job Title Field");
            BasePage.WaitingForElementToBeVisible(JobTitle);
            JobTitle.click();
            JobTitleValue.click();
            logger.debug("Value Entered to Job Title..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Job Title Field", e);
        }


    }

    public void SetVacancy()
    {
        try
        {
            logger.trace("Trying to Find Vacancy Field");
            BasePage.WaitingForElementToBeVisible(Vacancy);
            Vacancy.click();
            VacancyValue.click();
            logger.debug("Value Entered to Vacancy..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Vacancy Field", e);
        }

    }

    public void SetHiringManager()
    {
        try
        {
            logger.trace("Trying to Find Hiring Manager Field");
            BasePage.WaitingForElementToBeVisible(HiringManager);
            HiringManager.click();
            HiringManagerValue.click();
            logger.debug("Value Entered to Hiring Manager..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Hiring Manager Field", e);
        }

    }

    public void SetStatus()
    {
        try
        {
            logger.trace("Trying to Find Status Field");
            BasePage.WaitingForElementToBeVisible(Status);
            Status.click();
            StatusValue.click();
            logger.debug("Value Entered to Status..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Status Field", e);
        }

    }

    public void SetCandidateName(String candidateName)
    {
        try
        {
            logger.trace("Trying to Find Candidate Name Field");
            BasePage.WaitingForElementToBeVisible(CandidateName);
            CandidateName.sendKeys(candidateName);
            logger.debug("Value Entered to Candidate Name..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Candidate Name Field", e);
        }

    }

    public void SetKeywords(String keywords)
    {

        try
        {
            logger.trace("Trying to Find Keywords Field");
            BasePage.WaitingForElementToBeVisible(Keywords);
            Keywords.sendKeys(keywords);
            logger.debug("Value Entered to Keywordse..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Keywords Field", e);
        }
    }

    public void SetFromDate(String fromDate)
    {
        try
        {
            logger.trace("Trying to Find FromDate Field");
            BasePage.WaitingForElementToBeVisible(FromDate);
            FromDate.sendKeys(fromDate);
            logger.debug("Value Entered to FromDate..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : FromDate Field", e);
        }

    }

    public void SetToDate(String toDate)
    {
        try
        {
            logger.trace("Trying to Find ToDate Field");
            BasePage.WaitingForElementToBeVisible(ToDate);
            ToDate.sendKeys(toDate);
            logger.debug("Value Entered to ToDate..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : ToDate Field", e);
        }

    }

    public void SetMethodOfApplication()
    {
        try
        {
            logger.trace("Trying to Find Method Of Application Field");
            BasePage.WaitingForElementToBeVisible(MethodOfApplication);
            MethodOfApplication.click();
            MethodOfApplicationValue.click();
            logger.debug("Value Entered to Method Of Application..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Method Of Application Field", e);
        }

    }

    public void CheckJobTitleIsEmpty()
    {
        String inputValue = JobTitle.getAttribute("value");
        if (inputValue == null ||inputValue.isEmpty()) {
            System.out.println("✅ JobTitle field is clear.");
        } else {
            System.out.println("❌ JobTitle field is not clear. Value: " + inputValue);
        }
    }

    public void ClickReset()
    {
        ResetButton.click();
    }

    public void ClickSearch()
    {
        SearchButton.click();
    }

    public void ClickAdd()
    {
        AddButton.click();
    }

    public String CheckRecordsVisibility()
    {
        BasePage.WaitingForElementToBeVisible(RecordsFound);
        RecordsFound.isDisplayed();
        String RecordsWord = RecordsFound.getText();
        return RecordsWord;
    }

    public void SearchForCandidate( String candidateName, String keywords, String fromDate, String toDate)
    {
        SetJobTitle();
        SetVacancy();
        SetHiringManager();
        SetStatus();
        SetCandidateName(candidateName);
        SetKeywords(keywords);
        SetFromDate(fromDate);
        SetToDate(toDate);
        SetMethodOfApplication();
    }

    public void AddNewCandidate(String candidateName, String keywords, String fromDate, String toDate)
    {
        SetJobTitle();
        SetVacancy();
        SetHiringManager();
        SetStatus();
        SetCandidateName(candidateName);
        SetKeywords(keywords);
        SetFromDate(fromDate);
        SetToDate(toDate);
        SetMethodOfApplication();
    }




}