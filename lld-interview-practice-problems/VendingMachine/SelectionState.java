public class SelectionState implements VendingMachineState {
    @Override
    public String getCurrentState() {
        return "SELECTION";
    }

    @Override
    public void next(VendingMachineContext context) {
        context.setCurrentState(new AwaitingPaymentState());
    }
}
