package Tests;

import Base.BaseTest;
import Pages.RecruitmentPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecruitmentPageTest extends BaseTest
{

    @Test
    public void InvalidSearchCandidateTestCase()
    {
        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");

        RecruitmentPage RecruitmentObj = new RecruitmentPage(driver);
        RecruitmentObj.ClickOnRecruitmentButton();
        RecruitmentObj.SearchForCandidate("admin","manager", "john smith", "Rejected" , "Gautham Raj R","","2025-20-05", "2025-27-05", "Manual");
        RecruitmentObj.ClickSearch();
        Assert.assertEquals(RecruitmentObj.CheckRecordsVisibility(), "No Records Found");
    }
}