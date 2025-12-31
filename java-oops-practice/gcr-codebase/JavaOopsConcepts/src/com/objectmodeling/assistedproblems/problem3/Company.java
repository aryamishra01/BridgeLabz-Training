package com.objectmodeling.assistedproblems.problem3;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    // Composition: Company creates Department
    public void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
    }

    public Department getDepartment(int index) {
        return departments.get(index);
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}

