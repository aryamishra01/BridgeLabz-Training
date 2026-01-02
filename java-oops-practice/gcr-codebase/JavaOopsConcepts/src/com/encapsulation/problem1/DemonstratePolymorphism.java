package com.encapsulation.problem1;

import java.util.ArrayList;
import java.util.List;

public class DemonstratePolymorphism {

	public static void main(String[] args) {

        // List of Employee references (polymorphism)
        List<Employee> employees = new ArrayList<>();

        // Creating Full-Time Employee object
        Employee e1 = new FullTimeEmployee(101, "Arya", 30000, 5000);
        e1.assignDepartment("IT");

        // Creating Part-Time Employee object
        Employee e2 = new PartTimeEmployee(102, "Rohan", 500, 40);
        e2.assignDepartment("Support");

        // Adding employees to list
        employees.add(e1);
        employees.add(e2);

        System.out.println("===== Employee Details Using Polymorphism =====");

        // Polymorphic behavior: same reference, different implementations
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
