package Tests;

import Base.BaseTest;
import Pages.BuzzPage;
import Pages.LogInOutPage;
import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BuzzTest extends BaseTest {

    Faker faker= new Faker();
    String post = faker.lorem().paragraph(2);
    String comment = faker.lorem().paragraph(1);

    @Test
    public void postPost(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.writePost(post);
        buzzPage.clickOnPostButton();
    }
    @Test
    public void likePost(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.likePost();
    }
    @Test
    public void addComment(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.clickOnCommentIcon();
        buzzPage.addComment(comment);
    }
    @Test()
    public void editComment(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.clickOnCommentIcon();
        buzzPage.addComment(comment);
        buzzPage.editeComment(comment);
    }
    @Test()
    public void likeComment(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.clickOnCommentIcon();
        buzzPage.addComment(comment);
        buzzPage.likeComment();
    }
    @Test()
    public void deleteComment(){
        LogInOutPage logObj = new LogInOutPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.clickOnCommentIcon();
        buzzPage.addComment(comment);

        buzzPage.deleteComment();
        buzzPage.clickOnDeleteButtonAlert();
    }
    @AfterMethod
    public void Logout(){
        logger.info("Time Module ➡\uFE0F \uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 Login Out");
        LogInOutPage login = new LogInOutPage(driver);
        login.Logout();
        logger.debug("Time module ➡\uFE0F ✅✅✅ Logout Completed");
    }

}
