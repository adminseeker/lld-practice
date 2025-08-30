public interface PaymentStrategy {
    public void processPayment(double pricePaid, double priceToBePaid)  throws VendingMachineException;
}
