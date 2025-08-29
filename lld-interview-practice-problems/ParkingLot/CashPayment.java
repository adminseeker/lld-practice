public class CashPayment implements PaymentStrategy {
    
    @Override
    public boolean processPayment(double paidAmount, double totalAmount){
        boolean valid=paidAmount>=totalAmount;
        if(valid){
            System.out.println("$"+paidAmount+" Cash Payment Successful!");
        }else{
            System.out.println("$"+paidAmount+" Cash Payment Not Successful!");
        }
        return valid;
    }
}
