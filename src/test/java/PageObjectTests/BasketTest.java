package PageObjectTests;

import bo.AddExpensiveItemToBasket;
import jakarta.xml.bind.JAXBException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.CustomTestListener;
import util.XMLStream;

import static java.lang.Integer.valueOf;
import static org.testng.Assert.assertTrue;

@Listeners(CustomTestListener.class)
public class BasketTest extends BaseTest {

    @DataProvider(name = "data-provider" ,parallel = true)
    public Object[][] dpMethod() throws  JAXBException {
     return XMLStream.useFilterData();
    }


   @Test(dataProvider = "data-provider" )

    public void notAtomicityMethod(String queryInput,String p3 , String maxPrice) throws InterruptedException {
        AddExpensiveItemToBasket BOinit = new AddExpensiveItemToBasket();
       BOinit.addExpensiveItemToBasket(queryInput);
       assertTrue(valueOf(BOinit.getSumOfGoods())<valueOf(maxPrice));

    }



}
