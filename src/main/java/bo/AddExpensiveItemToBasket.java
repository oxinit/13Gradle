package bo;

import Pages.PageVerReturn;

public class AddExpensiveItemToBasket  {
    private final PageVerReturn page;
    public AddExpensiveItemToBasket() {
        this.page = new PageVerReturn();
    }
    public AddExpensiveItemToBasket addExpensiveItemToBasket(String queryInput) throws InterruptedException {
        page.searchFieldSendKeys(queryInput)
        .clickFindButton()
        .expensiveSortClick()
        .hpCHeckBoxClick()
        .firstElementClick()
        .buyClick();
        return this ;
    }
    public  String getSumOfGoods() {
        return page.checkSumOfGoods();
    }

}
