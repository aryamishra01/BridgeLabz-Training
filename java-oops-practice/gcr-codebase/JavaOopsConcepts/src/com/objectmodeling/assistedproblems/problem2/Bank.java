package com.objectmodeling.assistedproblems.problem2;

public class Bank {

    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    // Association method
    public void openAccount(Customer customer, double balance) {
    	
        customer.setBalance(balance);
        customer.setBank(this);

        System.out.println("Account opened for " + customer.getName() + " in " + bankName + " with balance Rs " + balance);
    }
}


