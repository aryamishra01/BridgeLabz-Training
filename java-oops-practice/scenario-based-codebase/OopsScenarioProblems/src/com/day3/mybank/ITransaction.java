package com.day3.mybank;

public interface ITransaction {

	public double deposit(double amount);
	public double withdraw(double amount);
	public void checkBalance();
}
