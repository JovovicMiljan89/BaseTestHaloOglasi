import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorEmailPage extends BaseTestHaloOglasi{

public MailinatorEmailPage(){
    PageFactory.initElements(driver,this);
}
    @FindBy (linkText = "Aktiviraj nalog")
    WebElement AktivirajNalogClick;
@FindBy (id = "html_msg_body")
WebElement IframeBody;
@FindBy (id = "pills-links-tab")
WebElement LinkForLinks;
@FindBy(xpath = "//a[contains(text(),'https://www.halooglasi.com/aktivacija-naloga?userI')]")
WebElement LinkZaAktivaciju;


public void SwitchFocusToIframeBody() {

    wdWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IframeBody));
}
public void AktivirajNalogaButton(){
    wdWait.until(ExpectedConditions.elementToBeClickable(AktivirajNalogClick)).click();
}
public void driverSwitchFocusToIframeBody(){
    wdWait.until(ExpectedConditions.visibilityOf(IframeBody));
    driver.switchTo().frame(IframeBody);
}
public void LinkZaLinkoveClick(){
    wdWait.until(ExpectedConditions.elementToBeClickable(LinkForLinks)).click();
}
public void LinkZaAktivacijuNaloga(){
    wdWait.until(ExpectedConditions.elementToBeClickable(LinkZaAktivaciju)).click();
}



}
