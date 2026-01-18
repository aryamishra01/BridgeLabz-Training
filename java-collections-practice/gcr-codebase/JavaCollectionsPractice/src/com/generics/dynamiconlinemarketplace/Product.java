package com.generics.dynamiconlinemarketplace;

public class Product<T extends Category> {

    @Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category.getCategoryName()  + "]";
	}

	private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return name + " | " + category.getCategoryName() + " | Price: " + price;
    }
}
