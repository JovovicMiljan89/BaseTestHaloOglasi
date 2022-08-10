import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BaseTestHaloOglasi{
    public LogInPage(){

        PageFactory.initElements(driver,this);
    }

@FindBy(id = "EMailOrUsername")
    WebElement EmailOrUsernameInputField;
@FindBy(id = "Password")
    WebElement PasswordInputField;
@FindBy(xpath = "//button[normalize-space()='Uloguj me']")
    WebElement LoginButton;
@FindBy(xpath = "//a[@title='Registrujte se']")
WebElement RegistrujSeButton;


public void EmailOrUsernameSendKeys(String emailorusername){
    wdWait.until(ExpectedConditions.visibilityOf(EmailOrUsernameInputField)).clear();
    EmailOrUsernameInputField.sendKeys(emailorusername);
}
public void PasswordSendKeys(String password){
    wdWait.until(ExpectedConditions.visibilityOf(PasswordInputField)).clear();
    PasswordInputField.sendKeys(password);
}
public void LoginButtonclick() {
    wdWait.until(ExpectedConditions.elementToBeClickable(LoginButton)).click();
}
public void RegistrujSeButton(){
    wdWait.until(ExpectedConditions.elementToBeClickable(RegistrujSeButton)).click();
}












}
