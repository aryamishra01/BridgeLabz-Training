package com.generics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {

    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture -> Name: " + name +
                ", Price: " + price +
                ", Material: " + material);
    }
}

