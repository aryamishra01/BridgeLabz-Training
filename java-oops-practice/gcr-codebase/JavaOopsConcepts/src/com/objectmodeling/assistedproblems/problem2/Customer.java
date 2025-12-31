package com.objectmodeling.assistedproblems.problem2;

public class Customer {

	    private String name;
	    private double balance;
	    private Bank bank;

	    public Customer(String name) {
	        this.name = name;
	    }

	    public void setBank(Bank bank) {
	        this.bank = bank;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public String getName() {
	        return name;
	    }

	    // Customer communicating with Bank
	    public void viewBalance() {
	    	
	    	System.out.println("----- Account Details -----");
	        System.out.println("Customer Name : " + name);
	        System.out.println("Bank Name     : " + bank.getBankName());
	        System.out.println("Account Balance: Rs " + balance);
	    }
}
