package com.bankingsystem;

public class Transaction implements Runnable{
	
	private BankAccount account;
	private String customerName;
	private double amount;
	
	Transaction(BankAccount account, String customerName, double amount){
		
		this.account = account;
		this.customerName = customerName;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		account.withdraw(customerName, amount);
	}

}
