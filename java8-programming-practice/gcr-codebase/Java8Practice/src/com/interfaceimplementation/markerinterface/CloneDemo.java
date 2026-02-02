package com.interfaceimplementation.markerinterface;

class Product implements Cloneable {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product(101, "Laptop");
        Product p2 = (Product) p1.clone();

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
