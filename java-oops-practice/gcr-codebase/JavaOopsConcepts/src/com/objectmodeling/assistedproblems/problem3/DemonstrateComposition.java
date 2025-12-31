package com.objectmodeling.assistedproblems.problem3;

public class DemonstrateComposition {

	    public static void main(String[] args) {

	        Company company = new Company("CG");

	        // Create departments inside company
	        company.addDepartment("IT");
	        company.addDepartment("HR");

	        // Add employees inside departments
	        company.getDepartment(0).addEmployee(101, "Arya");
	        company.getDepartment(0).addEmployee(102, "Arshika");

	        company.getDepartment(1).addEmployee(201, "Neha");

	        // Display complete structure
	        company.displayCompany();

	        // When company object is removed,
	        // all departments and employees are also removed (composition)
	        company = null;
	    }
}
