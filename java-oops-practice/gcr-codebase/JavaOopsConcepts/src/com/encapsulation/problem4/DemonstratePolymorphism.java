package com.encapsulation.problem4;

import java.util.ArrayList;
import java.util.List;

public class DemonstratePolymorphism {

	public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        // Creating account objects
        BankAccount acc1 = new SavingsAccount("SB101", "Arya", 50000);
        BankAccount acc2 = new CurrentAccount("CA202", "Rohan", 120000);

        accounts.add(acc1);
        accounts.add(acc2);

        System.out.println("====== Bank Account Details ======");

        for (BankAccount acc : accounts) {

            System.out.println("----------------------------------");
            System.out.println("Account No   : " + acc.getAccountNumber());
            System.out.println("Holder Name  : " + acc.getHolderName());
            System.out.println("Balance      : ₹" + acc.getBalance());

            // Polymorphic interest calculation
            double interest = acc.calculateInterest();
            System.out.println("Interest     : ₹" + interest);

            // Loan processing using interface
            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                System.out.println("Loan Eligible: ₹" + loan.calculateLoanEligibility());
                loan.applyForLoan(50000);
            }
         }
     }
}

