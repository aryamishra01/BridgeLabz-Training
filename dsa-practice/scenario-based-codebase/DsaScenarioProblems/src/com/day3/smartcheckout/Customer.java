package com.day3.smartcheckout;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<String> items;

    public Customer(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    // Add item to customer's cart
    public void addItem(String item) {
        items.add(item.toLowerCase()); // normalize input
    }

    public String getName() {
        return name;
    }

    public List<String> getItems() {
        return items;
    }
}
