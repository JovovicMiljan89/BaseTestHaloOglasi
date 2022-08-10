import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestHaloOglasi {


    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public JavascriptExecutor js;
    public static Actions actions;

    @Before public void setUpOglasnika(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdWait = new WebDriverWait(driver,30000);
        js = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        driver.manage().window().fullscreen();
        driver.get("https://www.halooglasi.com/");

    }

    @After public void TearDownOglasnikTest() {

       driver.quit();
    }



}
