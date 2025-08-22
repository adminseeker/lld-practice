public class MilkDecorator extends CoffeeDecorator {
    private Double decoratorCost=2.0;

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+decoratorCost;
    }
}
