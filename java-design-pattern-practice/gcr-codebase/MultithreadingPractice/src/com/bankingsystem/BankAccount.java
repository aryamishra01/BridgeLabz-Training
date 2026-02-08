package com.bankingsystem;

public class BankAccount {

	private double balance = 10000;
	
	public synchronized void withdraw(String customerName, double amount) {
		
		System.out.println("[" + customerName + "] Attempting to withdraw " + amount);
		
		if(balance >= amount) {
			
			try {
				
				//simulate processing time
				Thread.sleep(500);
				
				balance = balance - amount;
				
				System.out.println("Transaction successful: " +
                        customerName +
                        ", Amount: " + amount +
                        ", Balance: " + balance +
                        ", Time: " + java.time.LocalTime.now());
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Transaction failed (Insufficient Balance): " +
                    customerName +
                    ", Amount: " + amount +
                    ", Balance: " + balance);
		}
	}
}
