public interface Parking {
    public void parkVehicle(Vehicle vehicle);
    public double getParkingFee();
    public boolean isEmpty();
    public int getId();
    public void exit(ParkingLotManager manager,PaymentStrategy paymentStrategy,double feePaid);
    public Vehicle getVehicle();
}
