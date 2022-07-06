package Pages;

import manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageVerReturn extends BasePage {
    @FindBy(xpath = "//input")
    private WebElement SearchField;
    @FindBy(xpath = "//button[contains(text(),'Найти')]")
    private WebElement FindButton;
    @FindBy(xpath = "//button[contains(@class,'cookie')]")
    private WebElement AcceptCookieAndClose;
    @FindBy(xpath = "//a[@data-id='HP']")///parent::li[contains(@class,"filter")]
    private WebElement hpCheckBoxClick;
    @FindBy(xpath = "//option[contains(text(),\"От дорогих\")]")
    private WebElement expensiveSort;
    @FindBy(xpath = "//rz-catalog//div[@data-goods-id]")
    private List<WebElement> firstElementOfQuerylist;
    @FindBy(xpath = "//span[text()=' Купить ']/ancestor::button[@aria-label='Купить']/ancestor::li")
    private WebElement buyButton;
    @FindBy(xpath = "//div[@class='cart-receipt__sum-price']/span")
    private WebElement totalCartSum;
    @FindBy(xpath = "//p[@data-testid='cost']"
            //  "//span[text()=' В корзине ']"
    )
    private WebElement BasketButton;

     public PageVerReturn searchFieldSendKeys(String searchKey) {
             DriverManager.waitVisibilityOfElement(60,SearchField);
             SearchField.sendKeys(searchKey);
             return this;
         }
          public PageVerReturn clickFindButton() throws InterruptedException {
              DriverManager.waitVisibilityOfElement(60,FindButton);
              FindButton.click();
              Thread.sleep(1000);
              return this;
          }
    public PageVerReturn hpCHeckBoxClick() throws InterruptedException {
        Thread.sleep(1000);
        DriverManager.waitVisibilityOfElement(60,hpCheckBoxClick);
        hpCheckBoxClick.click();
        return this;
    }
    public PageVerReturn expensiveSortClick() throws InterruptedException {
        Thread.sleep(1000);
        DriverManager.waitVisibilityOfElement(60,expensiveSort);
        expensiveSort.click();
        return this;
    }

    public PageVerReturn firstElementClick() throws InterruptedException {
        Thread.sleep(1000);
          DriverManager.waitVisibilityOfElement(60,firstElementOfQuerylist.get(1));
        firstElementOfQuerylist.get(1).click();
        return this;
    }

    public PageVerReturn buyClick() throws InterruptedException {
        Thread.sleep(1000);
          DriverManager.waitVisibilityOfElement(60,buyButton);
         //   Actions ac = new Actions(DriverManager.getDriver());
       //   ac.moveToElement(DriverManager.getDriver().findElement(By.xpath("//span[text()=' Купить ']/ancestor::button[@aria-label='Купить']/ancestor::li"))).build().perform();
        buyButton.click();
        return this;
    }

    public PageVerReturn buyBasketClick(){
        BasketButton.click();
        return this;
    }

    public String checkSumOfGoods() {
        DriverManager.waitVisibilityOfElement(60,totalCartSum);
         return totalCartSum.getText();
    }
}
