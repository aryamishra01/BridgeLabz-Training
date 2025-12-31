package com.objectmodeling.selfproblems.problem2;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String universityName;

    // Composition: University owns and controls departments
    private List<Department> departments;

    // Aggregation: Faculty objects exist independently
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Creating departments inside University → composition
    public void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
    }

    // Adding already-created faculty → aggregation
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department d : departments) {
            d.displayDepartment();
        }
    }

    public void showFaculties() {
        System.out.println("Faculty members in " + universityName + ":");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }

    // Simulates deletion of university
    // Departments are removed → composition behavior
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University deleted → All departments removed.");
    }
}
