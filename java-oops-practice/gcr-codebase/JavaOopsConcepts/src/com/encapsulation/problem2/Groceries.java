package com.encapsulation.problem2;

public class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    // 5% discount on groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
