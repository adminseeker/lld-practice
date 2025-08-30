public class MaintenanceState implements VendingMachineState {
    @Override
    public String getCurrentState() {
        return "MAINTENANCE";
    }

    @Override
    public void next(VendingMachineContext context) {
        context.setCurrentState(new ReadyState());
    }
}
