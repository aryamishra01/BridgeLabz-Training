package com.day8.foodloop;

import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items;
    private double total;

    // Constructor for custom combo meals
    public Order(List<FoodItem> items) {
        this.items = items;
        this.total = 0;
    }

    // Polymorphism: discount based on order total
    public double applyDiscount(double amount) {
        if (amount >= 500) {
            return amount * 0.20;   // 20% discount
        } else if (amount >= 300) {
            return amount * 0.10;   // 10% discount
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        System.out.println("\n******** ORDER DETAILS ********");

        for (FoodItem item : items) {
            if (item.isAvailable()) {
                item.showDetails();
                total += item.getPrice();   // operator usage
                item.reduceStock();
            } else {
                System.out.println(item.name + " is out of stock!");
            }
        }

        double discount = applyDiscount(total);
        total = total - discount;

        System.out.println("-------------------------------");
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Total Payable  : ₹" + total);
        System.out.println("*******************************");
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled successfully.");
    }
}

