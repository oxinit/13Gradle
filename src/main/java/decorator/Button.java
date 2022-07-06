package decorator;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

public class Button  {
   // Logger logger;
    WebElement f;
    public Button(WebElement webEle) {
      f=webEle;
    }

public void safeClick(){
    try{
        f.click();
    }catch(ElementClickInterceptedException exception){
        f.click();
      //  Logger.info("Decorated button were pressed wow man!.!");
    }
}

}
