package se.lexicon;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Order {

    //encapsulated fields and using collection framework

    private int orderId;
    private String customerName;
    private ArrayList<Product> products;
    private LocalDateTime orderDate;

    //Constructor to initialize fields

    public Order(int orderId, String customerName, ArrayList<Product> products, LocalDateTime orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.products = new ArrayList<>();// empty order at start
        this.orderDate = orderDate;
    }

    // Generate getters for read-only access

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    //add product to the order
    public void addProduct(Product product){
        if (product != null){
            products.add(product);
        } else {
            throw new IllegalArgumentException("Product cannot be null");
        }
    }
}
