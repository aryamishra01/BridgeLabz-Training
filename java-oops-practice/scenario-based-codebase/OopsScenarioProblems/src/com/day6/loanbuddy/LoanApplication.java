package com.day6.loanbuddy;

//Base loan application class
public abstract class LoanApplication implements IApprovable {

	 protected String loanType;
	 protected int term;               // in months
	 protected double interestRate;    // annual interest rate
	 protected Applicant applicant;
	
	 // Loan status cannot be modified outside
	 protected String loanStatus = "PENDING";
	
	 public LoanApplication(String loanType, int term, double interestRate, Applicant applicant) {
	     this.loanType = loanType;
	     this.term = term;
	     this.interestRate = interestRate;
	     this.applicant = applicant;
	 }
	
	 // Internal approval logic
	 @Override
	 public boolean approveLoan() {
	     if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 20000) {
	         loanStatus = "APPROVED";
	         return true;
	     } else {
	         loanStatus = "REJECTED";
	         return false;
	     }
	 }
	
	 // EMI formula (can be overridden)
	 @Override
	 public double calculateEMI() {
	     double P = applicant.getLoanAmount();
	     double R = interestRate / (12 * 100); // monthly rate
	     int N = term;
	
	     return (P * R * Math.pow(1 + R, N)) /
	            (Math.pow(1 + R, N) - 1);
	 }
	
	 public String getLoanStatus() {
	     return loanStatus;
	 }
}

