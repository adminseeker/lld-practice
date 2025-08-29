public class VehicleFactory{
    
    private VehicleFactory(){};
    
    public static Vehicle getVehicle(String type,String number){
        if(type.equals("bike")){
            return new Bike(number,10.00);
        }else if(type.equals("car")){
            return new Car(number,15.00);
        }else if(type.equals("truck")){
            return new Truck(number,20.00);
        }else throw new IllegalArgumentException("Invalid Vehicle!");
    }

}
