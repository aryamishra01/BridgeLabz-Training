package com.day10.payxpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, java.time.LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    // polymorphic payment method
    public void pay() {
        if (!isPaid()) {
            markAsPaid();
            System.out.println("Electricity bill paid successfully");
        } else {
            System.out.println("Bill already paid");
        }
    }

    // polymorphic reminder
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Reminder pay your electricity bill before due date");
        }
    }
}

