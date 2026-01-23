package com.day10.binarysearchtree2;

public class ProductBST {

	private ProductNode root;

    // -------- INSERT PRODUCT --------
    public void insert(int sku, String name, double price) {
        root = insertRec(root, sku, name, price);
        System.out.println("Product added successfully!");
    }

    private ProductNode insertRec(ProductNode root, int sku, String name, double price) {
        if (root == null)
            return new ProductNode(sku, name, price);

        if (sku < root.sku)
            root.left = insertRec(root.left, sku, name, price);
        else if (sku > root.sku)
            root.right = insertRec(root.right, sku, name, price);
        else
            System.out.println("SKU already exists!");

        return root;
    }

    // -------- LOOKUP PRODUCT --------
    public ProductNode search(int sku) {
        return searchRec(root, sku);
    }

    private ProductNode searchRec(ProductNode root, int sku) {
        if (root == null || root.sku == sku)
            return root;

        if (sku < root.sku)
            return searchRec(root.left, sku);

        return searchRec(root.right, sku);
    }

    // -------- UPDATE PRICE --------
    public void updatePrice(int sku, double newPrice) {
        ProductNode product = search(sku);
        if (product != null) {
            product.price = newPrice;
            System.out.println("Price updated successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    // -------- DELETE PRODUCT --------
    public void delete(int sku) {
        root = deleteRec(root, sku);
        System.out.println("If product existed, it is removed.");
    }

    private ProductNode deleteRec(ProductNode root, int sku) {
        if (root == null)
            return null;

        if (sku < root.sku)
            root.left = deleteRec(root.left, sku);
        else if (sku > root.sku)
            root.right = deleteRec(root.right, sku);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            ProductNode successor = minValue(root.right);
            root.sku = successor.sku;
            root.name = successor.name;
            root.price = successor.price;

            root.right = deleteRec(root.right, successor.sku);
        }
        return root;
    }

    private ProductNode minValue(ProductNode node) {
        ProductNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // -------- DISPLAY SORTED --------
    public void displayAll() {
        if (root == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\nProduct List (Sorted by SKU):");
        inorder(root);
    }

    private void inorder(ProductNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("SKU: " + root.sku +
                    " | Name: " + root.name +
                    " | Price: ₹" + root.price);
            inorder(root.right);
        }
    }
}

