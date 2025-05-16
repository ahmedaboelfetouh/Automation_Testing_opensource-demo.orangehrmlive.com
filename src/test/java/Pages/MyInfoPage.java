package Pages;

import Base.BasePage;
import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPage extends BasePage
{

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
    WebElement MyInfoButton;

    //--Personal Details--//
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")
    WebElement FirstName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")
    WebElement MiddleName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")
    WebElement LastName;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
    WebElement Nickname;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
    WebElement EmployeeId;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")
    WebElement OtherId;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
    WebElement DriverLicense;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
    WebElement LicenseDate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")
    WebElement Nationality;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='American']")
    WebElement NationalityValue;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div")
    WebElement MaritalStatus;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Single']")
    WebElement MaritalStatusValue;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
    WebElement DateOfBirth;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div")
    WebElement Male;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label")
    WebElement Female;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input")
    WebElement MilitaryService;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label")
    WebElement Smoker;

    @FindBy(xpath = " //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
    WebElement SaveButton1;


    //--Custom Fields--//

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    WebElement BloodType;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='A+']")
    WebElement BloodTypeValue;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input")
    WebElement Test;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[3]/div/div[2]/input")
    WebElement TestField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")
    WebElement SaveButton2;

    //--Attachments--//

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button\n")
    WebElement AddButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]")
    WebElement SelectFile;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[2]/div/div/div/div[2]/textarea")
    WebElement CommentField;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]")
    WebElement SaveButton3;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[1]")
    WebElement CancelButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
    WebElement ContactDetails;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6")
    WebElement UpdatedUserName;


    //--Initialization--//

    public MyInfoPage(WebDriver driver)
    {
        super(driver);
        logger.info("Recruitment Page Object Created...");
    }


    public void NavigateToMyInfo()
    {
        try
        {
            logger.trace("Trying to Find My Info Link");
            BasePage.WaitingForElementToBeVisible(MyInfoButton);
            MyInfoButton.click();
            logger.debug("My Info Link is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : My Info Link ", e);
        }
    }

    //--Personal Details Methods--//

    public void SetFirstName(String FName)
    {
        try
        {
            logger.trace("Trying to Find FirstName Field");
            BasePage.WaitingForElementToBeVisible(FirstName);
            FirstName.clear();
            FirstName.sendKeys(FName);
            logger.debug("Value Entered to FirstName..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : FirstName Field", e);
        }
    }

    public void SetMiddleName(String MName)
    {
        try
        {
            logger.trace("Trying to Find MiddleName Field");
            BasePage.WaitingForElementToBeVisible(MiddleName);
            MiddleName.sendKeys(MName);
            logger.debug("Value Entered to MiddleName..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : MiddleName Field", e);
        }
    }

    public void SetLastName(String LName)
    {
        try
        {
            logger.trace("Trying to Find LastName Field");
            BasePage.WaitingForElementToBeVisible(LastName);
            LastName.clear();
            LastName.sendKeys(LName);
            logger.debug("Value Entered to LastName..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : LastName Field", e);
        }
    }

    public void SetEmployeeId(String EmpId)
    {
        try
        {
            logger.trace("Trying to Find EmployeeId Field");
            BasePage.WaitingForElementToBeVisible(EmployeeId);
            EmployeeId.clear();
            EmployeeId.sendKeys(EmpId);
            logger.debug("Value Entered to EmployeeId..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : EmployeeId Field", e);
        }
    }

    public void SetOtherId(String OthId)
    {
        try
        {
            logger.trace("Trying to Find OtherId Field");
            BasePage.WaitingForElementToBeVisible(OtherId);
            OtherId.sendKeys(OthId);
            logger.debug("Value Entered to OtherId..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : OtherId Field", e);
        }
    }

    public void SetDriverLicense(String DLicense)
    {
        try
        {
            logger.trace("Trying to Find DriverLicense Field");
            BasePage.WaitingForElementToBeVisible(DriverLicense);
            DriverLicense.sendKeys(DLicense);
            logger.debug("Value Entered to DriverLicense..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : DriverLicense Field", e);
        }
    }

    public void SetLicenseDate(String LDate)
    {
        try
        {
            logger.trace("Trying to Find License Date Field");
            BasePage.WaitingForElementToBeVisible(LicenseDate);
            LicenseDate.sendKeys(LDate);
            logger.debug("Value Entered to License Date..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : License Date Field", e);
        }
    }

    public void SetNationality()
    {
        try
        {
            logger.trace("Trying to Find Nationality Field");
            BasePage.WaitingForElementToBeVisible(Nationality);
            Nationality.click();
            NationalityValue.click();
            logger.debug("Value Entered to Nationality..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Nationality Field", e);
        }
    }

    public void SetMaritalStatus()
    {
        try
        {
            logger.trace("Trying to Find Marital Status Field");
            BasePage.WaitingForElementToBeVisible(MaritalStatus);
            MaritalStatus.click();
            MaritalStatusValue.click();
            logger.debug("Value Entered to Marital Status..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Marital Status Field", e);
        }
    }

    public void SetDateOfBirth(String BirthDate)
    {
        try
        {
            logger.trace("Trying to Find DateOfBirth Field");
            BasePage.WaitingForElementToBeVisible(LicenseDate);
            DateOfBirth.sendKeys(BirthDate);
            logger.debug("Value Entered to DateOfBirth..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : DateOfBirth Field", e);
        }
    }

    public void SelectMale()
    {
        try
        {
            logger.trace("Trying to Find Male Button");
            BasePage.WaitingForElementToBeVisible(Nationality);
            Male.click();
            logger.debug("Male Button is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Male Button ", e);
        }
    }

    public void SelectFemale()
    {
        try
        {
            logger.trace("Trying to Find Female Button");
            BasePage.WaitingForElementToBeVisible(Nationality);
            Female.click();
            logger.debug("Female Button is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Female Button ", e);
        }
    }

    public void ClickSaveButton1()
    {
        try
        {
            logger.trace("Trying to Find Save Button1");
            BasePage.WaitingForElementToBeVisible(SaveButton1);
            SaveButton1.click();
            logger.debug("Save Button1 is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Save Button1 ", e);
        }
    }

    public void ClickSaveButton2()
    {
        try
        {
            logger.trace("Trying to Find Save Button2");
            BasePage.WaitingForElementToBeVisible(SaveButton2);
            SaveButton2.click();
            logger.debug("Save Button2 is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Save Button2 ", e);
        }
    }

    public void ClickSaveButton3()
    {
        try
        {
            logger.trace("Trying to Find Save Button3");
            BasePage.WaitingForElementToBeVisible(SaveButton3);
            SaveButton3.click();
            logger.debug("Save Button3 is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Save Button3 ", e);
        }
    }

    public void SetBloodType()
    {
        try
        {
            logger.trace("Trying to Find Blood Type Field");
            BasePage.WaitingForElementToBeVisible(BloodType);
            BloodType.click();
            BloodTypeValue.click();
            logger.debug("Value Entered to Blood Type..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Blood Type Field", e);
        }
    }

    public void SetTest(String test)
    {
        try
        {
            logger.trace("Trying to Find Test ");
            BasePage.WaitingForElementToBeVisible(Test);
            Test.sendKeys(test);
            logger.debug("Value Entered to Test..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Test ", e);
        }
    }

    public void SetTestField(String TField)
    {
        try
        {
            logger.trace("Trying to Find Test Field");
            BasePage.WaitingForElementToBeVisible(TestField);
            TestField.sendKeys(TField);
            logger.debug("Value Entered to Test Field..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Test Field", e);
        }
    }

    public void ClickAddButton()
    {
        try
        {
            logger.trace("Trying to Find Add Button");
            BasePage.WaitingForElementToBeVisible(AddButton);
            AddButton.click();
            logger.debug("Add Button is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Add Button ", e);
        }
    }

    public void ClickCancelButton()
    {
        try
        {
            logger.trace("Trying to Find Cancel Button");
            BasePage.WaitingForElementToBeVisible(CancelButton);
            CancelButton.click();
            logger.debug("Cancel Button is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Cancel Button ", e);
        }
    }

    public void UploadFile(String Path)
    {
        try
        {
            logger.trace("Trying to Find Select File Field");
            BasePage.WaitingForElementToBeVisible(Test);
            SelectFile.sendKeys(Path);
            logger.debug("Value Entered to Select File..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Select File Field", e);
        }
    }

    public void SetComment(String Comment)
    {
        try
        {
            logger.trace("Trying to Find Comment Field");
            BasePage.WaitingForElementToBeVisible(CommentField);
            CommentField.sendKeys(Comment);
            logger.debug("Value Entered to Comment..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Comment Field", e);
        }
    }


    public void NavigateToContactDetails()
    {
        try
        {
            logger.trace("Trying to Find ContactDetails Link");
            BasePage.WaitingForElementToBeVisible(ContactDetails);
            ContactDetails.click();
            logger.debug("ContactDetails Link is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : ContactDetails ", e);
        }
    }

    public String GetUpdatedText()
    {
        return UpdatedUserName.getText();
    }

    public void CheckEditDetails(String fName,String lName)
    {
        NavigateToMyInfo();
        SetFirstName(fName);
        SetLastName(lName);
        SelectMale();
        SetBloodType();
        ClickSaveButton1();
        NavigateToContactDetails();
    }



}
