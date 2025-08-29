public class UPIPayment implements PaymentStrategy {
    
    @Override
    public boolean processPayment(double paidAmount, double totalAmount){
        boolean valid=paidAmount>=totalAmount;
        if(valid){
            System.out.println("$"+paidAmount+" UPI Payment Successful!");
        }else{
            System.out.println("$"+paidAmount+" UPI Payment Not Successful!");
        }
        return valid;
    }
}
