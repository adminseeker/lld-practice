import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private int shelfId;
    private List<Product> products;
    
    public Shelf(int shelfId){
        this.shelfId=shelfId;
        this.products=new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public boolean removeProduct(Product product){
        return products.remove(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public int getShelfId(){
        return shelfId;
    }
}
