package com.day3.mybank;

public class SavingsAccount extends Account {

    private double interestRate = 4.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Savings Interest Added: ₹" + interest);
    }
}
