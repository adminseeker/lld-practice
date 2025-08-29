
public class Application {
    public static void main(String[] args) {
        ParkingLotManager manager = ParkingLotManager.getInstance();
        Vehicle bike = VehicleFactory.getVehicle("bike","KA001");
        Vehicle car = VehicleFactory.getVehicle("car","KA002");
        Vehicle truck = VehicleFactory.getVehicle("truck","KA003");

        manager.printSlots();
        
        System.out.println();

        try {
            Parking slot1 = manager.assignParkingSlot(bike);
            

            manager.printSlots();

            //slot1 wants to vacate
            double feeToBePaid = slot1.getParkingFee();
            PaymentStrategy cardPayment = new CardPayment();
            slot1.exit(manager, cardPayment, feeToBePaid);

            manager.printSlots();


            Parking slot2 = manager.assignParkingSlot(car);
            Parking slot3 = manager.assignParkingSlot(truck);

            manager.printSlots();
        } catch (SlotUnavailableException e) {
            System.out.println(e.getMessage());
        }
       
    }

}
