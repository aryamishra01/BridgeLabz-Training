package com.inheritance.hybridinheritance.program1;

public class Chef extends Person implements Worker {

    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Role : Chef");
        System.out.println("Duty : Preparing meals (" + specialty + ")");
    }
}

