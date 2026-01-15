package com.day10.payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    private String type;
    protected double amount;
    private LocalDate dueDate;
    private boolean isPaid;

    // constructor to create bill
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // method to calculate late fee using operator
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // encapsulated payment status
    protected void markAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getAmount() {
        return amount;
    }
}

