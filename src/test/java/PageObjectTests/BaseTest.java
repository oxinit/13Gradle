package PageObjectTests;

import manager.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import util.CustomTestListener;
@Listeners(CustomTestListener.class)
public class BaseTest {
  @AfterClass
  public void clean(){
      DriverManager.getDriver().quit();
  }
@AfterClass
    public void terminate(){
    DriverManager.terminate();
    }
}
