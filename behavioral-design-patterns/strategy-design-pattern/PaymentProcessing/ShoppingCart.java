public class ShoppingCart {
    private Payment payment;
    
    public ShoppingCart(Payment payment){
        this.payment=payment;
    }

    public void makePayment(){
        payment.processPayment();
    }
}
