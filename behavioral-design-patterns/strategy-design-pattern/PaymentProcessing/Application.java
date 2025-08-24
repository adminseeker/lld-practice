public class Application {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment());
        cart.makePayment();

        cart=new ShoppingCart(new PayPalPayment());
        cart.makePayment();

        cart=new ShoppingCart(new UPIPayment());
        cart.makePayment();
    }
}
