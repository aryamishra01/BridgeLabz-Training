package com.encapsulation.problem4;

public abstract class BankAccount {

    // Encapsulated fields
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters (controlled access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter with validation
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     * Deposit money into account
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    /*
     * Withdraw money with validation
     */
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    /*
     * Abstract method to calculate interest
     */
    public abstract double calculateInterest();
}
