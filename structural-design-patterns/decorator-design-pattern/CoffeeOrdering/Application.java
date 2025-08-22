public class Application {
    public static void main(String[] args) {
        
        //Plain Coffee
        Coffee coffee = new PlainCoffee();
        System.out.println("Plain Coffee: $"+coffee.getCost());

        //Coffee with Milk and Sugar
        coffee = new PlainCoffee();
        coffee=new MilkDecorator(coffee);
        coffee=new SugarDecorator(coffee);
        System.out.println("Coffee with Milk And Sugar: $"+coffee.getCost());

        //Coffee with Caramel, Milk And Cream
        coffee = new PlainCoffee();
        coffee = new CaramelDecorator(coffee);
        coffee=new MilkDecorator(coffee);
        coffee=new CreamDecorator(coffee);
        System.out.println("Coffee with Caramel, Milk And Cream: $"+coffee.getCost());
    }
}
