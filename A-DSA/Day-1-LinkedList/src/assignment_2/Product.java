package assignment_2;

public class Product {

    private int productId;
    private int quantity;
    private int price;

    public Product() {
    }

    public Product(int productId, int quantity, int price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price;
    }
}
