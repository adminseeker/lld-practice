public class PaypalPayment implements Payment{

    @Override
    public void processPayment(Double price){
        System.out.println("Processing Payment "+price+" via paypal");
    }
}
