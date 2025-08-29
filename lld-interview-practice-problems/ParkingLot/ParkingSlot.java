import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingSlot implements Parking{
    private int id;
    private Vehicle vehicle;
    private LocalDateTime startTime;

    public ParkingSlot(int id){
        this.id=id;
    }

    @Override
    public void parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        startTime=LocalDateTime.now();
    }

    @Override
    public void exit(ParkingLotManager manager,PaymentStrategy paymentStrategy,double feePaid){
        double parkingCost = getParkingFee();
        boolean validated = manager.validateParking(this,paymentStrategy,feePaid,parkingCost);
        if(validated){
             System.out.println(vehicle.getNumber()+" parking validated Successfully!");
            vehicle=null;
        }else{
            System.out.println(vehicle.getNumber()+" parking validation failed!");
        }
    }
    
    @Override
    public double getParkingFee(){
        Duration duration = Duration.between(startTime, LocalDateTime.now());
        int hours = Math.max(1,(int)Math.ceil(duration.getSeconds()/3600d));
        return vehicle.getPricePerHour()*hours;
    }

    @Override
    public boolean isEmpty(){
        return vehicle==null;
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public Vehicle getVehicle(){
        return vehicle;
    }
}
