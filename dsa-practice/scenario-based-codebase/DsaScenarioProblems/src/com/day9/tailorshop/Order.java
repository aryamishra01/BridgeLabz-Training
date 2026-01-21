package com.day9.tailorshop;

public class Order {

    int orderId;
    int deadline; // smaller value = earlier delivery

    public Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }
}

