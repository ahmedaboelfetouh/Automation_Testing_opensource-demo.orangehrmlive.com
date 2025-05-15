package Pages;

import Base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuzzPage extends BasePage {
    public BuzzPage(WebDriver driver) {
        super(driver);
    }
 @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a")
private WebElement buzzTab;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/form/div/textarea")
    private WebElement postTextField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/form/div/div/button")
    private WebElement postButton;
    @FindBy(id = "heart")
    private WebElement likePost;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/div[3]/div[1]/button[1]")
    private WebElement commentIcon;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/div[4]/div/form/div/div[2]/input")
    private WebElement commentTextField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/div[4]/div[2]/div[2]/div[2]/p[2]")
    private WebElement editComment;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/div[4]/div[2]/div[2]/div[2]/p[3]")
    private WebElement deleteCommentButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/div[4]/div[2]/div[2]/div[2]/p[1]")
    private WebElement likComment;
   public void clickOnBuzzTab(){

           BasePage.WaitingForElementToBeVisible(buzzTab);
           buzzTab.click();

   }
    public void writePost(String post){
        BasePage.WaitingForElementToBeVisible(postTextField);
        postTextField.sendKeys(post);
    }
    public void clickOnPostButton(){
        BasePage.WaitingForElementToBeVisible(postButton);
        postButton.click();
    }
    public void likePost(){
        BasePage.WaitingForElementToBeVisible(likePost);
        likePost.click();
    }
    public void clickOnCommentIcon(){
        BasePage.WaitingForElementToBeVisible(commentIcon);
        commentIcon.click();
    }
    public void addComment(String comment){
        BasePage.WaitingForElementToBeVisible(commentTextField);
        commentTextField.sendKeys(comment+ Keys.ENTER);
    }
    public void editeComment( String newComment){
       // BasePage.WaitingForElementToBeVisible(editComment);
        editComment.click();
        commentTextField.clear();
        addComment(newComment);
    }
    public void likeComment(){
       // BasePage.WaitingForElementToBeVisible(likComment);
        likComment.click();
    }
    public void deleteComment(){
       // BasePage.WaitingForElementToBeVisible(deleteCommentButton);
        deleteCommentButton.click();

    }

}
