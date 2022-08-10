import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Mailinator extends BaseTestHaloOglasi{
    public Mailinator(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='search']")
    WebElement SearchMailInputField;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement GoButton;




    public void SearchMailInputSendKeys (String SearchMailInput){
        wdWait.until(ExpectedConditions.visibilityOf(SearchMailInputField)).clear();
        SearchMailInputField.sendKeys(SearchMailInput);
    }
    public void GoButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(GoButton)).click();
    }
}
