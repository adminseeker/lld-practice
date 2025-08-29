public class CardPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double paidAmount, double totalAmount){
        boolean valid=paidAmount>=totalAmount;
        if(valid){
            System.out.println("$"+paidAmount+" Card Payment Successful!");
        }else{
            System.out.println("$"+paidAmount+" Card Payment Not Successful!");
        }
        return valid;
    }
}
