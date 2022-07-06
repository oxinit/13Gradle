package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.PropertiesReader;

import java.time.Duration;

public class DriverManager {

    private static ThreadLocal<RemoteWebDriver> driverThread = new ThreadLocal<>();
    private static final String URL = new PropertiesReader().getUrl();

    private DriverManager(){ }

    public static WebDriver getDriver() {
        if(driverThread.get()==null){
           // WebDriverManager.chromedriver().setup();
            ChromeOptions opt = new ChromeOptions();
            opt.setBinary("C:\\Program Files\\Google\\Chrome Beta\\Application\\chrome.exe");
            System.setProperty(
                    "webdriver.chrome.driver","C:\\Users\\vexli\\" +
                            ".cache\\selenium\\chromedriver\\win32\\104.0.5112.20\\chromedriver.exe");
           new DriverManager().driverThread.set(new ChromeDriver(opt));
            getDriver().manage().window().maximize();
            getDriver().get(URL);
        }
        return driverThread.get();
    }

    public static void waitVisibilityOfElement(long timeToWait, WebElement locator) {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeToWait));
             wait.until(ExpectedConditions.visibilityOf(locator));
       }
//    public void waitForPageLoading(long timeToWait) {
    //    new WebDriverWait(getDriver(), Duration.ofSeconds(timeToWait)).until(
   //             webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
  //  }

    public static void terminate() {
        driverThread.remove();
    }
}

