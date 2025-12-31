package com.objectmodeling.selfproblems.problem2;

//Department life cycle depends on University (Composition)
public class Department {

	    private String departmentName;

	    public Department(String departmentName) {
	        this.departmentName = departmentName;
	    }

	    public void displayDepartment() {
	        System.out.println("Department: " + departmentName);
	    }

}
