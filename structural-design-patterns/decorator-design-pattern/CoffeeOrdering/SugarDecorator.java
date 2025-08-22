public class SugarDecorator extends CoffeeDecorator{
    private Double decoratorCost=1.0;
    
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+decoratorCost;
    }
}
