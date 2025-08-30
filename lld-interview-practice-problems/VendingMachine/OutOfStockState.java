public class OutOfStockState implements VendingMachineState {
    @Override
    public String getCurrentState() {
        return "OUTOFSTOCK";
    }

    @Override
    public void next(VendingMachineContext context) {
        if(!context.getInventory().isEmpty()){
            context.setCurrentState(new ReadyState());
        }else{
            context.setCurrentState(new OutOfStockState());
        }
    }
}
