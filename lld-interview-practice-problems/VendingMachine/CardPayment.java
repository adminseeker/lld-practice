public class CardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double pricePaid, double priceToBePaid) throws VendingMachineException {
        if(pricePaid>=priceToBePaid){
            System.out.println("Card Payment Successful!");
        }else {
            throw new VendingMachineException("Payment Failed!. Try Again");
        }
    }
}
