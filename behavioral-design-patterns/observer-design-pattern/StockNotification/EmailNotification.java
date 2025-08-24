public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message, Stock stock ,Investor investor) {
        System.out.println(investor.getName()+" received Email notification for "+stock.getStockName()+" stock: "+ message);
    }
}
