package com.day3.mybank;

public class CurrentAccount extends Account {

    private double interestRate = 2.0;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Current Account Interest Added: ₹" + interest);
    }
}