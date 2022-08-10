import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorInboxPage extends BaseTestHaloOglasi{
    public MailinatorInboxPage()
    {
        PageFactory.initElements(driver,this);}
    @FindBy (xpath = "//td[contains(text(),'Molimo aktivirajte Vaš Halo oglasi nalog')]")
    WebElement NewMessage;


    public void NewMessageOpen(){
        wdWait.until(ExpectedConditions.visibilityOf(NewMessage));
        wdWait.until(ExpectedConditions.elementToBeClickable(NewMessage)).click();
    }





}
