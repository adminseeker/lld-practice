public class SlotUnavailableException extends Exception {
    public SlotUnavailableException(String vehicleNumber){
        super("No Slots Available For Vehicle: "+vehicleNumber+"!");
    }
}
