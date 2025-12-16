package se.lexicon;

public class Product {

    private int productId;
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize fields

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name ==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    // Override toString method to return product information

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}
