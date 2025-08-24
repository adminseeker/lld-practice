public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing Payment Via Credit Card...");
    }
}
