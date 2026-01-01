package com.inheritance.assistedproblems.problem2;

public class UseEmployee {

    public static void main(String[] args) {

        Employee e1 = new Manager(101, "Amit", 90000, 10);
        Employee e2 = new Developer(102, "Riya", 70000, "Java");
        Employee e3 = new Intern(103, "Kunal", 15000, 6);

        // Polymorphism: same method, different behavior
        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}

