public class Application {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();
        inventory.addProductsToInventory();
        VendingMachineContext vendingMachine = new VendingMachineContext(new ReadyState());
        // vendingMachine.setCurrentState(new MaintenanceState());
        vendingMachine.displayMenu();
    }
}
