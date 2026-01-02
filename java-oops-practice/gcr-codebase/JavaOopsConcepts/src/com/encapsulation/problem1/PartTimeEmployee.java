package com.encapsulation.problem1;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0); // base salary not fixed for part-time
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    /*
     * Overriding abstract method
     * Salary = hours worked × hourly rate
     */
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
