package com.encapsulation.problem2;

public class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    // 10% discount on electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    // 18% GST
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST @18% applied on electronics";
    }
}
