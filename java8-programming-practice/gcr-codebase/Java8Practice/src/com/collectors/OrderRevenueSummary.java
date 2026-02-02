package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    private String customer;
    private double amount;

    public Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }
}

public class OrderRevenueSummary {

    public static void main(String[] args) {

        //Step 1: Create list of orders
        List<Order> orders = Arrays.asList(
            new Order("Arya", 1500.0),
            new Order("Rahul", 2000.0),
            new Order("Arya", 3000.0),
            new Order("Rahul", 1000.0)
        );

        //Step 2: Sum order amounts per customer
        Map<String, Double> revenueByCustomer =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      Order::getCustomer,
                      Collectors.summingDouble(Order::getAmount)
                  ));

        //Step 3: Print result
        System.out.println(revenueByCustomer);
    }
}
