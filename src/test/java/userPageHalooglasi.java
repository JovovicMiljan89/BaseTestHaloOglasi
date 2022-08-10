import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class userPageHalooglasi extends BaseTestHaloOglasi{
    public userPageHalooglasi (){
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(css = "div[class='header-category-link logged-in-wrapper opened'] p[class='user-display-name']")
    WebElement MainDisplayedUserName;
    @FindBy(css = "div[class='header-category-link logged-in-wrapper opened'] p[class='user-email']")
    WebElement EmailDisplayed;
    @FindBy(css = "div[class='header-category-link logged-in-wrapper opened'] div[class='user-data']")
    WebElement SecondaryDisplayedUserName;
    @FindBy(xpath = "//p[@class='header-label']")
    WebElement MyProfileHover;


    public void MyProfileHoverAction(){
        actions.moveToElement(MyProfileHover).perform();
    }
    public boolean MainDisplayedUsernameDisplayed(){
       return wdWait.until(ExpectedConditions.visibilityOf(MainDisplayedUserName)).isDisplayed();
    }
    public String MainDisplayedUsernameGetText() {
        return wdWait.until(ExpectedConditions.visibilityOf(MainDisplayedUserName)).getText();
    }
    public boolean EmailisDisplayed(){
        return wdWait.until(ExpectedConditions.visibilityOf(EmailDisplayed)).isDisplayed();
    }
    public String EmailisDisplayedGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(EmailDisplayed)).getText();
    }
    public boolean SecondaryDisplayedUserNameDisplayed(){
        return wdWait.until(ExpectedConditions.visibilityOf(SecondaryDisplayedUserName)).isDisplayed();
    }
    public String SecondaryDisplayedUserNameGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(SecondaryDisplayedUserName)).getText();
    }
}
