public class Car implements Vehicle {
    private double pricePerHour;
    private String number;
     public Car(String vehicleNumber,double price){
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
