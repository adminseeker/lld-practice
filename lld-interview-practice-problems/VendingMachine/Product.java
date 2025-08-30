public class Product {
    private int productId;
    private String productName;
    private ProductType productType;
    private double price;
    private int quantity;

    public Product(int productId, String productName, ProductType productType, double price){
        this.productId=productId;
        this.productName=productName;
        this.productType=productType;
        this.price=price;
        this.quantity=0;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int n){
        this.quantity=n;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
