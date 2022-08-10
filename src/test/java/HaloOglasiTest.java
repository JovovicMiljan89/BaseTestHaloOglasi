import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class HaloOglasiTest extends BaseTestHaloOglasi{
    public HaloOglasiTest(){
        PageFactory.initElements(driver,this);}
    HaloOglasiHomePage haloOglasiHomePage;
    RegistrationPage registrationPage;
    LogInPage logInPage;
    Mailinator mailinator;
    MailinatorInboxPage mailinatorInboxPage;
    MailinatorEmailPage mailinatorEmailPage;
    AktivacijaNalogaHaloOglasi aktivacijaNalogaHaloOglasi;
    userPageHalooglasi userPageHalooglasi;

    Random random = new Random();
    String testIme = "MiljanJanaJelena" + random.nextInt(999999);
    String testEmail = testIme + "@mailinator.com";
    String password = testIme;



    @Before public void setUpHaloOglasi(){
        haloOglasiHomePage = new HaloOglasiHomePage();
        registrationPage = new RegistrationPage();
        logInPage = new LogInPage();
        driver.get("https://www.halooglasi.com/");
        driver.manage().window().maximize();
        mailinator = new Mailinator();
        mailinatorInboxPage = new MailinatorInboxPage();
        mailinatorEmailPage = new MailinatorEmailPage();
        aktivacijaNalogaHaloOglasi = new AktivacijaNalogaHaloOglasi();
        userPageHalooglasi = new userPageHalooglasi();
    }
    @Test public void haloOglasiTest() throws InterruptedException {
        haloOglasiHomePage.UlogujSeButtonClick();
        logInPage.RegistrujSeButton();
//        Thread.sleep(10000);
        registrationPage.UserNameInputField.sendKeys(testIme);
        registrationPage.FizickoLiceSelect();
        registrationPage.EmailInputField.sendKeys(testEmail);
        registrationPage.PasswordInputField.sendKeys(password);
        registrationPage.ConfirmPasswordInputField.sendKeys(password);
        registrationPage.SaglasanSamCheckBox.click();
        registrationPage.NewsletterCheckBox.click();
        registrationPage.RegistrujMeButton();
        Assert.assertTrue(registrationPage.RegistracijaUspesnaDisplayed());
        Assert.assertEquals("Registracija uspešna",registrationPage.RegistracijaUspesnaGetText());
        Assert.assertTrue(registrationPage.RegistracijaJeUspelaDisplayed());
        Assert.assertEquals("Registracija je uspela!",registrationPage.RegistracijaJeUspelaGettext());
        Assert.assertTrue(registrationPage.LinkZaAktivacijuDisplayed());
        Assert.assertEquals("Registracija je uspela!",registrationPage.LinkZaAktivacijuGetText());

        driver.get("https://www.mailinator.com/");

        mailinator.SearchMailInputField.sendKeys(testEmail);
        mailinator.GoButton.click();
//        mailinatorInboxPage.NewMessage.click();
        mailinatorInboxPage.NewMessageOpen();
        Thread.sleep(5000);
        //       mailinatorEmailPage.SwitchFocusToIframeBody();
//        mailinatorEmailPage.AktivirajNalogaButton();
        mailinatorEmailPage.LinkZaLinkoveClick();
        mailinatorEmailPage.LinkZaAktivacijuNaloga();
        aktivacijaNalogaHaloOglasi.SwitchToNewTab(2,1);
        aktivacijaNalogaHaloOglasi.AktivacijaNalogaDisplayed();
        Assert.assertTrue(aktivacijaNalogaHaloOglasi.AktivacijaNalogaDisplayed());
        Assert.assertEquals("Vaš nalog je uspešno aktiviran!",aktivacijaNalogaHaloOglasi.AktivacijaNalogaGetText());
        aktivacijaNalogaHaloOglasi.PrijavaButtonClick();
        logInPage.EmailOrUsernameInputField.sendKeys(testEmail);
        logInPage.PasswordInputField.sendKeys(password);
        logInPage.LoginButton.click();
        Thread.sleep(5000);
        userPageHalooglasi.MyProfileHoverAction();
        Assert.assertTrue(userPageHalooglasi.MainDisplayedUsernameDisplayed());
        Assert.assertEquals("MiljanJovovicJanaJovovic", userPageHalooglasi.MainDisplayedUsernameGetText());
        Assert.assertTrue(userPageHalooglasi.EmailisDisplayed());
        Assert.assertEquals("email " + testEmail ,userPageHalooglasi.EmailisDisplayedGetText());
        Assert.assertTrue(userPageHalooglasi.SecondaryDisplayedUserNameDisplayed());
        Assert.assertEquals("korisničko ime: " + testIme,userPageHalooglasi.SecondaryDisplayedUserNameGetText());

    }
}
