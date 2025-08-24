public class Application {
    public static void main(String[] args) {
        Stock aaplStock = new Stock("AAPL",150);
        Investor alice = new Investor("Alice", new EmailNotification());
        Investor bob = new Investor("Bob", new SMSNotification());

        aaplStock.join(alice);
        aaplStock.join(bob);

        aaplStock.setPrice(155);

        aaplStock.exit(bob);

        aaplStock.setPrice(160.56);
    }
}
