public class Truck implements Vehicle {
    private double pricePerHour;
    private String number;
     public Truck(String vehicleNumber,double price){
        this.number=vehicleNumber;
        this.pricePerHour=price;
    }

    @Override
    public double getPricePerHour() {
        return pricePerHour;
    }

    @Override
    public String getNumber(){
        return number;
    }
}
