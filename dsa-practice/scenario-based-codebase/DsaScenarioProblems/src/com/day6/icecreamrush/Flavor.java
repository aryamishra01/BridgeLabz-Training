package com.day6.icecreamrush;

public class Flavor {
    String name;
    int sales;

    Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return name + " - Sold: " + sales;
    }
}

