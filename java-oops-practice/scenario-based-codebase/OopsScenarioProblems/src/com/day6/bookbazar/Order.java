package com.day6.bookbazar;

import java.util.ArrayList;
import java.util.List;

// Order class
public class Order {

    private String customerName;
    private List<Book> books = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    private String orderStatus = "CREATED"; // restricted access

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            books.add(book);
            quantities.add(quantity);
        } else {
            System.out.println("❌ Not enough stock for this book.");
        }
    }

    // Internal method to update order status
    protected void updateStatus(String status) {
        orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public double calculateTotal() {
        double totalCost = 0;

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            int qty = quantities.get(i);

            // price × quantity – discount (polymorphism)
            totalCost += book.applyDiscount(qty);
        }
        return totalCost;
    }
}
