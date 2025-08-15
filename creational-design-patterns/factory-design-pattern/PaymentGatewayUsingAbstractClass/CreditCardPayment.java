public class CreditCardPayment implements Payment{

    @Override
    public void processPayment(Double price){
        System.out.println("Processing Payment "+price+" via credit card");
    }
}
