package com.day10.payxpress;

import java.util.Scanner;
import java.time.LocalDate;

public class PayXPressApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take bill type from user
        System.out.println("Enter bill type: Electricity Water Internet");
        String type = sc.nextLine();

        // take amount
        System.out.println("Enter bill amount");
        double amount = sc.nextDouble();

        // take due date
        System.out.println("Enter due date in format yyyy mm dd");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        LocalDate dueDate = LocalDate.of(y, m, d);

        Bill bill = null;

        // inheritance object creation
        if (type.equalsIgnoreCase("Electricity")) {
            bill = new ElectricityBill(amount, dueDate);
        } else if (type.equalsIgnoreCase("Water")) {
            bill = new WaterBill(amount, dueDate);
        } else if (type.equalsIgnoreCase("Internet")) {
            bill = new InternetBill(amount, dueDate);
        } else {
            System.out.println("Invalid bill type");
            return;
        }

        // polymorphic reminder
        bill.sendReminder();

        // late fee calculation using operator
        System.out.println("Enter penalty amount if late");
        double penalty = sc.nextDouble();
        double total = bill.calculateLateFee(penalty);
        System.out.println("Total amount to pay is " + total);

        // payment process
        System.out.println("Do you want to pay now yes or no");
        sc.nextLine();
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            bill.pay();
        } else {
            System.out.println("Payment pending");
        }

        sc.close();
    }
}

