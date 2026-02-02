package com.interfaceimplementation.defaultmethods;

interface PaymentProcessor {

    void pay(double amount);

    // New feature added later
    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to customer");
    }
}

class UpiProcessor implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardProcessor implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

public class PaymentGateway {

    public static void main(String[] args) {

        PaymentProcessor upi = new UpiProcessor();
        PaymentProcessor card = new CardProcessor();

        upi.pay(500);
        upi.refund(200);

        card.pay(1000);
        card.refund(300);
    }
}
