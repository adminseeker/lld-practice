import java.util.List;
import java.util.Scanner;

public class VendingMachineContext {
    private VendingMachineState currentState;
    private Inventory inventory;
    private double balance;
    
    public VendingMachineContext(VendingMachineState state){
        this.currentState=state;
        this.inventory=Inventory.getInstance();
        this.balance=30.00;
    }

    public void setCurrentState(VendingMachineState state){
        this.currentState=state;
    }

    public void displayMenu(){
        try(Scanner scanner = new Scanner(System.in)){
            while(true){
                if(inventory.isEmpty()){
                    System.out.println("Inventory Empty!");
                    break;
                }

                try{
                    if(currentState instanceof ReadyState){
                        System.out.println("Choose A Shelf From 1 to "+inventory.getTotalShelves()+" or -1 to exit"+":");
                        int shelfId = scanner.nextInt();
                        if(shelfId==-1) break;
                        if(shelfId>inventory.getTotalShelves()) throw new VendingMachineException("Invalid Shelf Option!");
                        List<Product> products = inventory.getAllProductsOnShelf(shelfId);
                        if(products.size()==0){
                            throw new VendingMachineException("Empty Shelf! Choose Other Shelf.");
                        }
                        System.out.println("Choose Product To Buy: ");
                        for(Product product : products){
                            System.out.println(product.getQuantity()+" items in stock: "+product.getProductName() + ", "+ product.getProductType().name() + ", $"+product.getPrice() + " - Option " + product.getProductId());
                        }
                        int productId = scanner.nextInt();
                        
                        //selection state
                        currentState.next(this);
                        Product product = chooseProduct(shelfId, productId);
                        if(product==null){
                            System.out.println("Invalid Product Selection!");
                            continue;
                        }

                        if(product.getQuantity()==0){
                            System.out.println("Out Of Stock!. Please Try Again!");
                            continue;
                        }
                        
                        //make payment
                        System.out.println("Please Choose Payment Type: ");
                        System.out.println("1 - Card\n2 - Cash");
                        int paymentChoice = scanner.nextInt();
                        if(paymentChoice>2 || paymentChoice<=0) throw new VendingMachineException("Invalid Payment Choice!");
                        System.out.println("Pay: ");
                        double paid = scanner.nextDouble();

                        if(paymentChoice==1){
                            makePayment(shelfId,product, new CardPayment(), paid);
                        }else if(paymentChoice==2){
                            makePayment(shelfId,product, new CashPayment(), paid);
                        }                    

                        //dispensing state
                        currentState.next(this);    
                        System.out.println("Item Dispensed!");
                        //ready state
                        currentState.next(this);

                    }else throw new IllegalStateException("Vending Machine Is Not In Ready State!");
                } catch (VendingMachineException e) {
                    System.out.println(e.getMessage());
                    resetState();

                }
            }
        }
      
        
        if(currentState instanceof MaintenanceState){
            System.out.println("Under Maintenance! Please Try Again!");
        } else if(currentState instanceof OutOfStockState){
            currentState.next(this);
            System.out.println("Out Of Stock!. Please Try Again!");
        }
       
    }

    public Product chooseProduct(int shelfId, int productId){
        if(currentState instanceof SelectionState){
            Product product = inventory.getProduct(shelfId, productId);
            if(product!=null){
                //awaiting payment state
                currentState.next(this);
            }
            return product;
        }else throw new IllegalStateException("Vending Machine Is Not In Selection State!");
    }

    public void makePayment(int shelfId, Product product, PaymentStrategy paymentStrategy, double paidAmount) throws VendingMachineException{
        
        double change=paidAmount-product.getPrice();
        if(change>balance){
            throw new VendingMachineException("Vending Machine Has No Change Left to Return!");
        }
        
        paymentStrategy.processPayment(paidAmount, product.getPrice());
        if(change>=0){
            int quantity = product.getQuantity();
            product.setQuantity(quantity-1);
            if(product.getQuantity()==0) inventory.removeProduct(shelfId, product);
        }
        if(change>0){
            balance-=change;
            System.out.println("Returning Extra Change: "+change);
        }else if(change<0){
            throw new VendingMachineException("Payment Failed! Try Again!");
        }

    }

    public VendingMachineState getCurrentState(){
        return currentState;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void resetState(){
        this.currentState=new ReadyState();
    }
}
