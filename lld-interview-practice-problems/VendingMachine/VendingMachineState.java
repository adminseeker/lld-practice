public interface VendingMachineState {
    public String getCurrentState();
    public void next(VendingMachineContext context);
}
