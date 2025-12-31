package com.objectmodeling.selfproblems.problem4;

import java.util.ArrayList;
import java.util.List;

// Order aggregates multiple Product objects
public class Order {

    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Communication: Order receives products
    public void addProduct(Product product) {
        products.add(product);
    }

    // Displays products inside the order
    public void showProducts() {
        System.out.println("Products in Order " + orderId + ":");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " (₹" + p.getPrice() + ")");
        }
    }

    // Calculates total bill amount
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

