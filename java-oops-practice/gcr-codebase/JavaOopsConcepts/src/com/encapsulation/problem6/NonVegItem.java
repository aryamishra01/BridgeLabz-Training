package com.encapsulation.problem6;

public class NonVegItem extends FoodItem implements Discountable {

    private final double extraCharge = 50; // non-veg handling charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (price * quantity) + extraCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied + ₹50 non-veg handling charge.";
    }
}
