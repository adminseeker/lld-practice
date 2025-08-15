public class PaypalPaymentCreator extends PaymentCreator{

    @Override
    public Payment createPayment() {
        return new PaypalPayment();
    }
    
}
