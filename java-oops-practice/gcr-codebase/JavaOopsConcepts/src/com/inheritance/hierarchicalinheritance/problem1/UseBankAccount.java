package com.inheritance.hierarchicalinheritance.problem1;

public class UseBankAccount {

	public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA202", 25000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount("FD303", 200000, 24);

        System.out.println("----- Savings Account -----");
        savings.displayAccountDetails();
        savings.displayAccountType();

        System.out.println("\n----- Checking Account -----");
        checking.displayAccountDetails();
        checking.displayAccountType();

        System.out.println("\n----- Fixed Deposit Account -----");
        fd.displayAccountDetails();
        fd.displayAccountType();
    }
}
