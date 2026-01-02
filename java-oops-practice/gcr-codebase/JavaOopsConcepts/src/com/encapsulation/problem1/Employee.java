package com.encapsulation.problem1;

public abstract class Employee implements Department {

    // Private variables → Encapsulation
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter and Setter methods (controlled access to fields)

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Interface method implementation
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    /*
     * Abstract method
     * Must be implemented by all subclasses
     * Salary calculation logic differs for each employee type
     */
    public abstract double calculateSalary();

    /*
     * Concrete method shared by all employees
     * Calls calculateSalary() → runtime polymorphism
     */
    public void displayDetails() {
        System.out.println("------------------------------------------------");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Base Salary   : ₹" + baseSalary);
        System.out.println("Final Salary  : ₹" + calculateSalary());
    }
}
