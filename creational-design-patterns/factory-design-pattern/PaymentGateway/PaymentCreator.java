public class PaymentCreator{

    public static Payment createPayment(PaymentType type){
        switch (type) {
            case PAYPAL:
                return new PaypalPayment();
            case CREDITCARD:
                return new CreditCardPayment();
            default:
                throw new IllegalArgumentException("invalid payment type");
        }
    }
}
