package com.day6.loanbuddy;

//Home loan with lower interest rate
public class HomeLoan extends LoanApplication {

	 public HomeLoan(int term, Applicant applicant) {
	     super("Home Loan", term, 8.5, applicant);
	 }
	
	 // Polymorphic EMI calculation
	 @Override
	 public double calculateEMI() {
	     double baseEMI = super.calculateEMI();
	     return baseEMI * 0.95; // 5% subsidy benefit
	 }
}

