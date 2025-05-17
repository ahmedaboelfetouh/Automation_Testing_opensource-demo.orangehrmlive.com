/******************************************************************************
 *
 * Module: Claim
 *
 * File Name: ClaimTest.java
 *
 * Description: Test for Assign Claim Feature for Claim Module
 *
 * Author: Ahmed Aboelfetouh
 *
 *******************************************************************************/
package Tests;

import Base.BaseTest;
import Pages.LogInOutPage;

import Pages.ClaimPage;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class ClaimTest extends BaseTest{

    @Test
    public void AssignClaimTest(){
        logger.info("Claim Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Starting Assign Claim Test");
        ClaimPage claim = new ClaimPage(driver);
        claim.OpenClaimModule();
        claim.OpenAssignClaim();
        claim.EnterAssignClaimData();
        assertEquals("Success",claim.SuccessMessage());
        claim.SubmitClaim();
        assertEquals("Success",claim.SuccessMessage());
        logger.debug("Claim module ➡\uFE0F ✅✅✅ Assign Claim Test Completed Successfully");
    }

    @BeforeMethod
    public void Login(){
        logger.info("Claim Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Start Login");
        LogInOutPage login = new LogInOutPage(driver);
        login.Login("Admin","admin123");
        logger.debug("Claim module ➡\uFE0F ✅✅✅ Login Completed");
    }

    @AfterMethod
    public void Logout(){
        logger.info("Claim Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Login Out");
        LogInOutPage login = new LogInOutPage(driver);
        login.Logout();
        logger.debug("Claim module ➡\uFE0F ✅✅✅ Logout Completed");
    }
}
