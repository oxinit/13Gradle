package Pages;

import manager.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(
               // new FieldDecoratorEx(new DefaultElementLocatorFactory
                        (DriverManager.getDriver())
        //)
                ,this);
    }



  //  public void implicitWait1(long timeOut) throws InterruptedException {
   //     driverFather.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
  //      sleep(timeOut);
  //  }
 //   public void waitForAjaxToComplete(long timeToWait) {
    //    new WebDriverWait(driverFather, Duration.ofSeconds(timeToWait)).until(
   //          webDriver -> ((JavascriptExecutor) webDriver).executeScript("return window.jQuery != undefined && jQuery.active == 0;"));
// }

  //  FluentWait wait2 = new FluentWait(driverFather);
   // wait2.
    //wait2.pollingEvery(250, TimeUnit.MILLISECONDS);
    //wait2.ignoring(NoSuchElementException.class);
      //      wait2.until(ExpectedConditions.alertIsPresent());

}
