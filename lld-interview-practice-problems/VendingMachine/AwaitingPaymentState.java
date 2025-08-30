public class AwaitingPaymentState implements VendingMachineState {
    @Override
    public String getCurrentState() {
        return "AWAITING_PAYMENT";
    }

    @Override
    public void next(VendingMachineContext context) {
        context.setCurrentState(new DispensingState());
    }
}
