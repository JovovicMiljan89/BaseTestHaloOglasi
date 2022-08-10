import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BaseTestHaloOglasi{
    public RegistrationPage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Fizičkog lica')]")
    WebElement FizickoLice;
    @FindBy(id = "UserName")
    WebElement UserNameInputField;
    @FindBy(id = "Email")
    WebElement  EmailInputField;
    @FindBy(id = "Password")
    WebElement PasswordInputField;
    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPasswordInputField;
    @FindBy (xpath = "//label[@for='HasAgreedToGetFiscalReceiptByEmail']")
    WebElement SaglasanSamCheckBox;
    @FindBy(xpath = "//input[@id='AllowSendingNewsletters']")
    WebElement NewsletterCheckBox;
    @FindBy(xpath = "//button[@class='button-reg save save-entity person-face btn-main']")
    WebElement RegistrujMeButton;
    @FindBy(xpath = "//div[@class='jquery-notific8-message']")
    WebElement RegistracijaUspesna;
    @FindBy(xpath = "//span[normalize-space()='Registracija je uspela!']")
    WebElement RegistracijaJeUspela;
    @FindBy(xpath = "//div[@class='row registration-step1']//p[1]")
    WebElement LinkZaAktivacijuText;
    @FindBy(xpath = "//a[normalize-space()='Uloguj se']")
    WebElement LoginButton;

    public void FizickoLiceSelect(){
        wdWait.until(ExpectedConditions.elementToBeClickable(FizickoLice));
        if (FizickoLice.isSelected())
           FizickoLice.click();
    }
    public void UserNameSendKeys(String UserName){
        wdWait.until(ExpectedConditions.visibilityOf(UserNameInputField)).clear();
        UserNameInputField.sendKeys(UserName);
    }
    public void EmailInputField(String Email){
        wdWait.until(ExpectedConditions.visibilityOf(EmailInputField)).clear();
        EmailInputField.sendKeys(Email);
    }
    public void PasswordInputField(String Password){
        wdWait.until(ExpectedConditions.visibilityOf(PasswordInputField)).clear();
        PasswordInputField.sendKeys(Password);
    }
    public void ConfirmPasswordInputField(String ConfirmPassword){
        wdWait.until(ExpectedConditions.visibilityOf(ConfirmPasswordInputField)).clear();
        ConfirmPasswordInputField.sendKeys(ConfirmPassword);
    }
    public void SaglasanSamCheckBox(){
        wdWait.until(ExpectedConditions.elementToBeClickable(SaglasanSamCheckBox));
        wdWait.until(ExpectedConditions.elementToBeClickable(SaglasanSamCheckBox)).click();
    }
    public void NewsletterCheckBox(){
        wdWait.until(ExpectedConditions.elementToBeClickable(NewsletterCheckBox));
        wdWait.until(ExpectedConditions.elementToBeClickable(NewsletterCheckBox)).click();}
    public void RegistrujMeButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(RegistrujMeButton)).click();
    }

    public boolean RegistracijaUspesnaDisplayed(){
        return wdWait.until(ExpectedConditions.visibilityOf(RegistracijaUspesna)).isDisplayed();
    }
    public String RegistracijaUspesnaGetText(){
    return wdWait.until(ExpectedConditions.visibilityOf(RegistracijaUspesna)).getText();
    }
    public boolean RegistracijaJeUspelaDisplayed(){
        return wdWait.until(ExpectedConditions.visibilityOf(RegistracijaJeUspela)).isDisplayed();
    }
    public String RegistracijaJeUspelaGettext(){
        return wdWait.until(ExpectedConditions.visibilityOf(RegistracijaJeUspela)).getText();
    }
    public boolean LinkZaAktivacijuDisplayed(){
        return wdWait.until(ExpectedConditions.visibilityOf(LinkZaAktivacijuText)).isDisplayed();
    }
    public String LinkZaAktivacijuGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(LinkZaAktivacijuText)).getText();
    }
    public void LoginButton(){
        wdWait.until(ExpectedConditions.elementToBeClickable(LoginButton)).click();
    }











}

