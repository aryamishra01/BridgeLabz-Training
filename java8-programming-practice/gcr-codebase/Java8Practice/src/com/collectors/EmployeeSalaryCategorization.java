package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        //Step 1: Create employee list
        List<Employee> employees = Arrays.asList(
            new Employee("Arya", "IT", 60000),
            new Employee("Rahul", "IT", 70000),
            new Employee("Neha", "HR", 45000),
            new Employee("Pooja", "HR", 51000),
            new Employee("Amit", "Finance", 80000)
        );

        //Step 2: Average salary per department
        Map<String, Double> avgSalaryByDept =
        	employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.averagingDouble(Employee::getSalary)
                     ));

        //Step 3: Print result
        System.out.println(avgSalaryByDept);
    }
}
