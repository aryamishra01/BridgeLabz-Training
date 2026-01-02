package com.day2.hospitalmanagementsystem;

public class HospitalApp {

	public static void main(String[] args) {

        // Doctor
        Doctor doctor = new Doctor(101, "Dr. Sharma", "Cardiology");
        doctor.displayInfo();

        System.out.println();

        // InPatient (Emergency)
        Patient p1 = new InPatient(1, "Rahul", "Heart Pain", 5);
        p1.displayInfo();

        System.out.println(p1.getSummary());

        System.out.println();

        // OutPatient (Normal)
        Patient p2 = new OutPatient(2, "Anita", "05-Jan-2026");
        p2.displayInfo();

        System.out.println();

        // Billing
        Payable bill = new Bill(5000, 0.18, 500);
        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}

