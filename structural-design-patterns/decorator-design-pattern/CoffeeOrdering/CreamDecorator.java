public class CreamDecorator extends CoffeeDecorator {
    private Double decoratorCost=2.0;
    public CreamDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public Double getCost() {
        return coffee.getCost()+decoratorCost;
    }
}
