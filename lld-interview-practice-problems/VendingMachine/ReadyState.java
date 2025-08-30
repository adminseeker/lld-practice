public class ReadyState implements VendingMachineState {
    @Override
    public String getCurrentState() {
        return "READY";
    }

    @Override
    public void next(VendingMachineContext context) {
        VendingMachineState nexState = new SelectionState();
        context.setCurrentState(nexState);
    }
}
