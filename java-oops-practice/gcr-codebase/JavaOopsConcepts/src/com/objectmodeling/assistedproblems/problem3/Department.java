package com.objectmodeling.assistedproblems.problem3;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    // Composition: Department creates Employee
    public void addEmployee(int id, String name) {
        Employee emp = new Employee(id, name);
        employees.add(emp);
    }

    public void displayDepartment() {
        System.out.println(" Department: " + departmentName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}
