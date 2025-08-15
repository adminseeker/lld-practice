import java.util.Scanner;

public class Application{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Payment: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Choose Payemnt Type: ");
        System.out.println("* Paypal");
        System.out.println("* CreditCard");
        System.out.print("Select: ");
        String choice = scanner.nextLine();
        scanner.close();

        try {
            Payment payment = PaymentCreator.createPayment(PaymentType.valueOf(choice.trim().toUpperCase()));
            payment.processPayment(price);
        } catch (IllegalArgumentException e) {
            System.out.println("Please Choose Valid Payment Type!");
        }
        
    }
}