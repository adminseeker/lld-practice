public class Book implements Item {
    private int price;
    private String ISBN;

    public Book(int price, String ISBN){
        this.price=price;
        this.ISBN=ISBN;
    }

    public int getPrice() {
        return price;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public int accept(Visitor visitor){ 
        return visitor.visit(this);
    }
}
