public class ShoppingCartVisitor implements Visitor{
    
    @Override
    public int visit(Book book) {
        if(book.getPrice()>500){
            return book.getPrice()-100;
        }
        return book.getPrice();
    }
    
    @Override
    public int visit(Fruit fruit){
        return fruit.getPrice()*fruit.getWeight();
    }

    @Override
    public int visit(Electronics electronics) {
        return electronics.getPrice()+(electronics.getWarranty()*electronics.getWarrantFee());
    }
}
