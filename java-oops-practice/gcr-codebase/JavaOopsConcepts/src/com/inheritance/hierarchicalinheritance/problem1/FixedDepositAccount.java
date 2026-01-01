package com.inheritance.hierarchicalinheritance.problem1;

public class FixedDepositAccount extends BankAccount {

    int lockPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int lockPeriod) {
        super(accountNumber, balance);
        this.lockPeriod = lockPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Lock Period  : " + lockPeriod + " months");
    }
}

