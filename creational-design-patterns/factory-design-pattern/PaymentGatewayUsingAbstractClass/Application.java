import java.util.Scanner;

public class Application{
    public static void main(String[] args) {

        Double price;
        String choice;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Payment: ");
            price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Choose Payemnt Type: ");
            System.out.println("* Paypal");
            System.out.println("* CreditCard");
            System.out.print("Select: ");
            choice = scanner.nextLine();
        }

        try {
            Payment payment = getPayment(PaymentType.valueOf(choice.trim().toUpperCase()));
            payment.processPayment(price);
        } catch (IllegalArgumentException e) {
            System.out.println("Please Choose Valid Payment Type!");
        }

    }

    
    public static Payment getPayment(PaymentType type){
        PaymentCreator paymentCreator;
        Payment payment;
        
        switch(type){
             case PAYPAL:
                paymentCreator = new PaypalPaymentCreator();
                break;
            case CREDITCARD:
                paymentCreator = new CreditCardPaymentCreator();
                break;
            default:    
                throw  new IllegalArgumentException("Invalid Payment Type!");
        }
        payment = paymentCreator.createPayment();
        return payment;
    }
}