package com.day10.binarysearchtree2;

public class ProductNode {

	int sku;
    String name;
    double price;
    ProductNode left, right;

    public ProductNode(int sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        left = right = null;
    }
}
