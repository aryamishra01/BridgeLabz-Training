package com.day10.payxpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, java.time.LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    public void pay() {
        if (!isPaid()) {
            markAsPaid();
            System.out.println("Water bill paid successfully");
        } else {
            System.out.println("Bill already paid");
        }
    }

    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Reminder pay your water bill to avoid service stop");
        }
    }
}

