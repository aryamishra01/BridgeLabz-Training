package com.inheritance.hybridinheritance.program1;

public class Waiter extends Person implements Worker {

    int experienceYears;

    public Waiter(String name, int id, int experienceYears) {
        super(name, id);
        this.experienceYears = experienceYears;
    }

    @Override
    public void performDuties() {
        System.out.println("Role : Waiter");
        System.out.println("Duty : Serving customers with " + experienceYears + " years of experience");
    }
}

