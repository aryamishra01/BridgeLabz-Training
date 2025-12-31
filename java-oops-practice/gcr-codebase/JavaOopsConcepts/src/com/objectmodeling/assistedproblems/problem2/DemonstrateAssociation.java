package com.objectmodeling.assistedproblems.problem2;

public class DemonstrateAssociation {
	
	public static void main(String[] args) {

	        Bank sbi = new Bank("State Bank of India");
	        Bank hdfc = new Bank("HDFC Bank");

	        Customer arya = new Customer("Arya");
	        Customer arshika = new Customer("Arshika");

	        // Association in action
	        sbi.openAccount(arya, 25000);
	        hdfc.openAccount(arshika, 40000);

	        // Customers checking balance
	        arya.viewBalance();
	        arshika.viewBalance();
	  }
}


