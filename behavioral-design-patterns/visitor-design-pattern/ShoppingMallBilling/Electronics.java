public class Electronics implements Item{
    private int price;
    private int warranty;
    private int warrantFee;

    public Electronics(int price, int warranty, int warrantFee){
        this.price=price;
        this.warranty=warranty;
        this.warrantFee=warrantFee;
    }

    public int getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }

    public int getWarrantFee() {
        return warrantFee;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}