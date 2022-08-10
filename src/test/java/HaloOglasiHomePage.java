import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiHomePage extends BaseTestHaloOglasi{

public HaloOglasiHomePage(){
    PageFactory.initElements(driver,this);}
@FindBy (xpath = "//a[normalize-space()='Uloguj se']")
    WebElement UlogujSeButton;
@FindBy (xpath = "//p[@class='cookie-policy-btn']")
    WebElement UreduPrihvatamButton;


public void UreduPrihvatamButton (){
    wdWait.until(ExpectedConditions.elementToBeClickable(UreduPrihvatamButton)).click();
}
public void UlogujSeButtonClick () {
    wdWait.until(ExpectedConditions.elementToBeClickable(UlogujSeButton)).click();
}







}
