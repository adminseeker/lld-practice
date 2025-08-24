public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message, Stock stock ,Investor investor) {
        System.out.println(investor.getName()+" received SMS notification for "+stock.getStockName()+" stock: "+ message);
    }
}
