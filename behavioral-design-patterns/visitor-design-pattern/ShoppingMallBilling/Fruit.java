public class Fruit implements Item {
    private int price;
    private int weight;

    public Fruit(int price, int weight){
        this.price=price;
        this.weight=weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
