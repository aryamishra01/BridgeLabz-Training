package com.inheritance.hierarchicalinheritance.problem1;

public class BankAccount {

    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}

