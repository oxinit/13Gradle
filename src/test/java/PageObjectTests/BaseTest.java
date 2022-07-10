package PageObjectTests;

import manager.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import util.CustomTestListener;
@Listeners(CustomTestListener.class)
public class BaseTest {
  @AfterMethod
  public void clean(){
      DriverManager.getDriver().quit();
  }
@AfterClass
    public void terminate(){
    DriverManager.terminate();
    }
}
