package com.day6.loanbuddy;

import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Applicant input
        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        // Loan selection
        System.out.print("Select Loan Type (1-Home Loan, 2-Auto Loan): ");
        int choice = sc.nextInt();

        System.out.print("Enter Loan Term (months): ");
        int term = sc.nextInt();

        LoanApplication loan;

        // Runtime polymorphism
        if (choice == 1) {
            loan = new HomeLoan(term, applicant);
        } else {
            loan = new AutoLoan(term, applicant);
        }

        // Approval process
        boolean approved = loan.approveLoan();

        System.out.println("\n--- Loan Decision ---");
        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Loan Status: " + loan.getLoanStatus());

        if (approved) {
            double emi = loan.calculateEMI();
            System.out.println("Monthly EMI: ₹" + String.format("%.2f", emi));
        } else {
            System.out.println("Loan Rejected due to low eligibility.");
        }

        sc.close();
    }
}

