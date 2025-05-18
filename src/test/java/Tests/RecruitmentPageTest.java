package Tests;

import Base.BaseTest;
import Pages.LogInOutPage;
import Pages.RecruitmentPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RecruitmentPageTest extends BaseTest
{

    @Test
    public void InvalidSearchCandidateTestCase()
    {
        logger.info("Recruitment Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login For Invalid Search Candidate TestCase");
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        RecruitmentPage RecruitmentObj = new RecruitmentPage(driver);
        RecruitmentObj.ClickOnRecruitmentButton();
        RecruitmentObj.SearchForCandidate( "","","2025-20-05", "2025-27-05");
        RecruitmentObj.ClickSearch();
        Assert.assertEquals(RecruitmentObj.CheckRecordsVisibility(), "No Records Found");
//        Assert.assertTrue(RecruitmentObj.CheckSuccessVisibility());
        logger.debug("Recruitment module ➡\uFE0F ✅✅✅ Invalid Search Candidate TestCase Completed");
    }
    @Test
    public void ValidSearchCandidateTestCase()
    {
        logger.info("Recruitment Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login For Valid Search Candidate TestCase ");
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        RecruitmentPage RecruitmentObj = new RecruitmentPage(driver);
        RecruitmentObj.ClickOnRecruitmentButton();
        RecruitmentObj.SearchForCandidate( "","","", "");
        RecruitmentObj.ClickSearch();
        Assert.assertNotEquals(RecruitmentObj.CheckRecordsVisibility(), "No Records Found");
        logger.debug("Recruitment module ➡\uFE0F ✅✅✅ Valid Search Candidate TestCase Completed");
    }
    @Test
    public void ResetButtonTestCase()
    {
        logger.info("Recruitment Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login For Reset Button TestCase");
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");

        RecruitmentPage RecruitmentObj = new RecruitmentPage(driver);
        RecruitmentObj.ClickOnRecruitmentButton();
        RecruitmentObj.SearchForCandidate("","","2025-20-05", "2025-27-05");
        RecruitmentObj.ClickReset();
        RecruitmentObj.CheckJobTitleIsEmpty();
        logger.debug("Recruitment module ➡\uFE0F ✅✅✅ Reset Button TestCase Completed");
    }

}