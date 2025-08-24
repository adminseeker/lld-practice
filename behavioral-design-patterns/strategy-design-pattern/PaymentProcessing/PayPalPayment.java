public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing Payment Via PayPal...");
    }
}
