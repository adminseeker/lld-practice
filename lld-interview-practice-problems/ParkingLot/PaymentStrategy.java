public interface PaymentStrategy {
    public boolean processPayment(double paidAmount, double totalAmount);
}
