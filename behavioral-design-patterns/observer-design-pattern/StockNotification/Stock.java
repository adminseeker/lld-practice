import java.util.ArrayList;
import java.util.List;

public class Stock implements StockActions {
    
    private String stockName;
    private double price;
    private List<Investor> investors;

    public Stock(String stockName,double price){
        this.stockName=stockName;
        this.price=price;
        this.investors=new ArrayList<>();
    }

    public String getStockName() {
        return stockName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.update("Stock price updated to "+price+"!");
    }

    @Override
    public void join(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void exit(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void update(String message) {
        for(Investor investor : investors){
            investor.getNotification().sendNotification(message, this, investor);
        }
    }

}
