package com.day10.payxpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, java.time.LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    public void pay() {
        if (!isPaid()) {
            markAsPaid();
            System.out.println("Internet bill paid successfully");
        } else {
            System.out.println("Bill already paid");
        }
    }

    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Reminder pay your internet bill to continue connection");
        }
    }
}

