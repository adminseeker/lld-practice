import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();
        cart.add(new Book(520, "11234"));
        cart.add(new Book(400, "11235"));
        cart.add(new Fruit(20, 5));
        cart.add(new Electronics(1000,2,50));

        System.out.println("Cart Value: "+calculateCartPrice(cart));
    }

    public static int calculateCartPrice(List<Item> cart){
        int total=0;
        for(Item item : cart){
            int itemValue=item.accept(new ShoppingCartVisitor());
            System.out.println(item.getClass().getName() + ": Final Price: "+itemValue);
            total+=itemValue;
        }
        return total;
    }
}
