public class DispensingState implements VendingMachineState {
    @Override
    public String getCurrentState() {
        return "DISPENSING";
    }

    @Override
    public void next(VendingMachineContext context) {
        context.setCurrentState(new ReadyState());
    }
}
