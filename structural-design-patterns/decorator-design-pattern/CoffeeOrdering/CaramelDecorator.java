public class CaramelDecorator extends CoffeeDecorator {
    private Double decoratorCost=1.0;

    public CaramelDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+decoratorCost;
    }
}
