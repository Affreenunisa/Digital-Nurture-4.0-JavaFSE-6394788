package ObserverPatternExample;


public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        market.registerObserver(mobileApp);
        market.registerObserver(webApp);

        market.setStockPrice(101.5);
        market.setStockPrice(105.0);

        market.removeObserver(webApp);
        market.setStockPrice(110.0);
    }
}