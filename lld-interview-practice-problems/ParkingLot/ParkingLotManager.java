import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {
    private List<Parking> availableSlots;
    private List<Parking> inUseSlots;
    private int slots=20;
    private static ParkingLotManager instance;

    private ParkingLotManager(){
        availableSlots=new ArrayList<>();
        for(int i=0;i<slots;i++){
            availableSlots.add(new ParkingSlot(i+1));
        }
        inUseSlots=new ArrayList<>();
    }


    public static ParkingLotManager getInstance(){
        if(instance==null) instance=new ParkingLotManager();
        return instance;
    }

    public Parking assignParkingSlot(Vehicle vehicle) throws SlotUnavailableException{
        if(availableSlots.isEmpty()) throw new SlotUnavailableException(vehicle.getNumber());
        Parking slot = availableSlots.remove(0);
        slot.parkVehicle(vehicle);
        inUseSlots.add(slot);
        System.out.println(slot.getId()+" assigned to "+vehicle.getNumber());
        return slot;
    }

    public boolean validateParking(Parking slot,PaymentStrategy paymentStrategy,double feePaid, double parkingCost){
        //check payment
        boolean parkingValidated = paymentStrategy.processPayment(feePaid, parkingCost);
        if(parkingValidated){
            inUseSlots.remove(slot);
            availableSlots.add(slot);
           
        }
        return parkingValidated;
    }

    public List<Parking> getAvailableSlots(){
        return availableSlots;
    }

    public void printSlots(){
        System.out.println("Available Slots: ");
        List<String> slotChr = new ArrayList<>(availableSlots.size());
        for(Parking slot : availableSlots){
           slotChr.add(String.valueOf(slot.getId()));
        }
        System.out.println(String.join(",",slotChr));
        System.out.println("In Use Slots: ");
        slotChr = new ArrayList<>(inUseSlots.size());
        for(Parking slot : inUseSlots){
           slotChr.add(String.valueOf(slot.getId()));
        }
        System.out.println(String.join(",",slotChr));
    }

}
