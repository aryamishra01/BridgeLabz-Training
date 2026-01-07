package com.day6.loanbuddy;

//Interface for loan approval and EMI calculation
public interface IApprovable {
	 boolean approveLoan();
	 double calculateEMI();
}

