public class Bike implements Vehicle {
    private double pricePerHour;
    private String number;
    public Bike(String vehicleNumber,double price){
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
