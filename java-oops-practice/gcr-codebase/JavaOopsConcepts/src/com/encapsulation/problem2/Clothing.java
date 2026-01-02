package com.encapsulation.problem2;

public class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    // 20% discount on clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    // 12% GST
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "GST @12% applied on clothing";
    }
}