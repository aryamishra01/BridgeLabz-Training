package com.objectmodeling.assistedproblems.problem3;

public class Employee {

    private String name;
    private int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayEmployee() {
        System.out.println("   Employee ID: " + id + ", Name: " + name);
    }
}

