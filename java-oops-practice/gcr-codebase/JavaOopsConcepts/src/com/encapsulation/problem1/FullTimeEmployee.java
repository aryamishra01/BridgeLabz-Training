package com.encapsulation.problem1;

public class FullTimeEmployee extends Employee {

    // Additional attribute specific to full-time employees
    private double fixedBonus;

    // Constructor
    public FullTimeEmployee(int id, String name, double baseSalary, double fixedBonus) {
        super(id, name, baseSalary); // calling parent constructor
        this.fixedBonus = fixedBonus;
    }

    /*
     * Overriding abstract method
     * Salary = base salary + fixed bonus
     */
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
    }
}
