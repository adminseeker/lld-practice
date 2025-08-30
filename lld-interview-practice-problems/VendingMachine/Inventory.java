import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    
    private Map<Integer,Shelf> shelves;
    private static int totalShelves;
    private static Inventory instance;

    private Inventory(){
        this.shelves=new LinkedHashMap<>();
        totalShelves=3;
        for(int i=0;i<totalShelves;i++){
            shelves.put(i+1, new Shelf(i+1));
        }
    }

    public static Inventory getInstance(){
        if(instance==null) instance=new Inventory();
        return instance;
    }

    public void setTotalShelves(int n){
        totalShelves=n;
    }

    public int getTotalShelves(){
        return totalShelves;
    }

    public void addProduct(int shelfId, Product product){
        if(shelfId<=totalShelves){
            Shelf shelf = shelves.get(shelfId);
            shelf.addProduct(product);
        }
    }

    public void removeProduct(int shelfId, Product product){
        if(shelfId<=totalShelves){
            Shelf shelf = shelves.get(shelfId);
            shelf.removeProduct(product);
        }
    }

    public Product getProduct(int shelfId, int productId){
        if(shelfId<=totalShelves){
            Shelf shelf = shelves.get(shelfId);
            Product product=null;
            for(Product item : shelf.getProducts()){
                if(item.getProductId()==productId){
                    product=item;
                    break;
                }
            }
            return product;
        }
        return null;
    }

    public List<Product> getAllProductsOnShelf(int shelfId){
        if(shelfId<=totalShelves){
            return shelves.get(shelfId).getProducts();
        }
        return new ArrayList<>();
    }

    public boolean isEmpty(){
        for(int i=0;i<totalShelves;i++){
            if(shelves.get(i+1).getProducts().size()!=0) return false;
        }
        return true;
    }

    public void addProductsToInventory(){
        Product kitkat = new Product(1, "KitKat", ProductType.CHOCOLATE, 1.00);
        kitkat.setQuantity(5);

        Product lays = new Product(2, "Lay's", ProductType.CHIPS, 3.00);
        lays.setQuantity(5);

        Product cocacola = new Product(3, "Coke", ProductType.COKE, 4.00);
        cocacola.setQuantity(1);

        Product chocochip = new Product(4, "Hide And Seek", ProductType.COOKIE, 2.00);
        chocochip.setQuantity(2);

        addProduct(1, kitkat);
        addProduct(1, lays);
        addProduct(2, cocacola);
        addProduct(2, chocochip);


    }
}
