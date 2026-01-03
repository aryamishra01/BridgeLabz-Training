package com.day3.mybank;

//Base Account class
public abstract class Account implements ITransaction {

	 protected String accountNumber;
	 private double balance;   // encapsulated
	
	 // Constructor with opening balance
	 public Account(String accountNumber, double balance) {
	     this.accountNumber = accountNumber;
	     this.balance = balance;
	 }
	
	 // Constructor without opening balance
	 public Account(String accountNumber) {
	     this.accountNumber = accountNumber;
	     this.balance = 0.0;
	 }
	
	 protected double getBalance() {
	     return balance;
	 }
	
	 protected void setBalance(double balance) {
	     this.balance = balance;
	 }
	
	 @Override
	 public double deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	     }
	     return balance;
	 }
	
	 @Override
	 public double withdraw(double amount) {
	     if (amount > 0 && amount <= balance) {
	         balance -= amount;
	     }
	     return balance;
	 }
	
	 @Override
	 public void checkBalance() {
	     System.out.println("Current Balance: ₹" + balance);
	 }
	
	 public abstract void calculateInterest();
}