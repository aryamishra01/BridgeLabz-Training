package com.objectmodeling.selfproblems.problem4;

import java.util.ArrayList;
import java.util.List;

// Customer places orders (association)
public class Customer {

    private int customerId;
    private String name;
    private List<Order> orders;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Communication: customer places an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order);
    }

    // Displays all orders placed by the customer
    public void showOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.showProducts();
            System.out.println("Total Amount: ₹" + o.calculateTotal());
        }
    }
}

