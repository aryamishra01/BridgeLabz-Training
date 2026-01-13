package com.day3.smartcheckout;

import java.util.*;

/*
 * Maintains item price and stock using HashMap
 */
public class Inventory {

    private HashMap<String, Integer> priceMap;
    private HashMap<String, Integer> stockMap;

    public Inventory() {
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }

    // Add item to inventory
    public void addItem(String item, int price, int stock) {
        item = item.toLowerCase(); // normalize key
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    public boolean isAvailable(String item) {
        return stockMap.getOrDefault(item.toLowerCase(), 0) > 0;
    }

    public int getPrice(String item) {
        return priceMap.getOrDefault(item.toLowerCase(), 0);
    }

    // Reduce stock after purchase
    public void reduceStock(String item) {
        item = item.toLowerCase();
        stockMap.put(item, stockMap.get(item) - 1);
    }
}

