package com.objectmodeling.selfproblems.problem2;

public class DemonstrateCompositionAndAggregation {

	    public static void main(String[] args) {

	        // Faculty objects exist independently (aggregation)
	        Faculty f1 = new Faculty(1, "Dr. Sharma");
	        Faculty f2 = new Faculty(2, "Dr. Mehta");

	        // Create University
	        University uni = new University("Tech University");

	        // Add departments (composition)
	        uni.addDepartment("Computer Science");
	        uni.addDepartment("Mechanical Engineering");

	        // Add faculty to university (aggregation)
	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        System.out.println("Before deleting university:");
	        uni.showDepartments();
	        uni.showFaculties();

	        // Delete university
	        System.out.println("\nDeleting university...");
	        uni.deleteUniversity();

	        // Departments removed
	        System.out.println("\nAfter deleting university:");
	        uni.showDepartments();

	        // Faculty still exists independently
	        System.out.println("\nFaculty still exists:");
	        f1.displayFaculty();
	        f2.displayFaculty();
	    }
}
	
