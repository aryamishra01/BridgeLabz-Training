package com.encapsulation.problem6;

public abstract class FoodItem {

    protected String itemName;
    protected double price;
    protected int quantity;

    // Encapsulated order details
    private boolean ordered;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.ordered = false;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item Name   : " + itemName);
        System.out.println("Price       : ₹" + price);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Order Status: " + (ordered ? "Placed" : "Not Placed"));
    }

    // Encapsulation
    public void placeOrder() {
        this.ordered = true;
    }

    public boolean isOrdered() {
        return ordered;
    }
}
