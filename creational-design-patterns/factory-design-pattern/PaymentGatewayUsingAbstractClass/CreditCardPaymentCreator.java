public class CreditCardPaymentCreator extends PaymentCreator{

    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
    
}
