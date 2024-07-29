package entities;

public class OrderItem {
    private int quantity;
    private Double price;
    private Product product;
    public OrderItem(int quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                ", price=" + String.format("%.2f",price) +
                ", product=" + product.getName() +
                ", subtotal=" + subTotal() +
                '}';
    }
}
