package com.day6.loanbuddy;

//Auto loan
public class AutoLoan extends LoanApplication {

	 public AutoLoan(int term, Applicant applicant) {
	     super("Auto Loan", term, 10.5, applicant);
	 }
	
	 @Override
	 public double calculateEMI() {
	     return super.calculateEMI(); // standard EMI
	 }
}

