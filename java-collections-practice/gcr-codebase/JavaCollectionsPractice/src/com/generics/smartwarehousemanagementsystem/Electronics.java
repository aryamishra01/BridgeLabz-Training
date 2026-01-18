package com.generics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem {

    private int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics -> Name: " + name +
                ", Price: " + price +
                ", Warranty: " + warrantyYears + " years");
    }
}

