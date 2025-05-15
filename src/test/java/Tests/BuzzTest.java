package Tests;

import Base.BaseTest;
import Pages.BuzzPage;
import Pages.LoginPage;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class BuzzTest extends BaseTest {

    Faker faker= new Faker();
    String post = faker.lorem().paragraph(2);
    String comment = faker.lorem().paragraph(1);



    @Test
    public void postPost(){
        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.writePost(post);
        buzzPage.clickOnPostButton();

    }
    @Test
    public void likePost(){
        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.likePost();
    }
    @Test
    public void addComment(){
        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.clickOnCommentIcon();
        buzzPage.addComment(comment);
    }
    @Test()
    public void editComment(){

        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.clickOnCommentIcon();
        buzzPage.addComment(comment);
        buzzPage.editeComment(comment);
    }
    @Test()
    public void likeComment(){
        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.clickOnCommentIcon();
        buzzPage.addComment(comment);
        buzzPage.likeComment();
    }
    @Test()
    public void deleteComment(){
        LoginPage logObj = new LoginPage(driver);
        logObj.Login("Admin","admin123");
        BuzzPage buzzPage = new BuzzPage(driver);
        buzzPage.clickOnBuzzTab();
        buzzPage.clickOnCommentIcon();
        buzzPage.addComment(comment);
        buzzPage.deleteComment();
    }


}
