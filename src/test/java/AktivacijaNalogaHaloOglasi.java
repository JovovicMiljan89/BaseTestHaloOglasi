import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class AktivacijaNalogaHaloOglasi extends BaseTestHaloOglasi{
    public AktivacijaNalogaHaloOglasi (){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[contains(text(),'Vaš nalog je uspešno aktiviran!')]")
    WebElement AktivacijaNalogaDisplayed;
    @FindBy(xpath = "//a[normalize-space()='Prijava']")
    WebElement PrijavaButton;
    public boolean AktivacijaNalogaDisplayed(){
        return wdWait.until(ExpectedConditions.visibilityOf(AktivacijaNalogaDisplayed)).isDisplayed();
    }
    public String AktivacijaNalogaGetText(){
        return wdWait.until(ExpectedConditions.visibilityOf(AktivacijaNalogaDisplayed)).getText();
    }
    public void PrijavaButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(PrijavaButton)).click();
    }
    public void SwitchToNewTab (int tabNumber,int tab) {
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(tabNumber));
        ArrayList<String> numberOfTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(numberOfTabs.get(1));
    }







}
