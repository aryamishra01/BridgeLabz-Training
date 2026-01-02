package com.day2.hospitalmanagementsystem;

public class OutPatient extends Patient {

    private String visitDate;

    public OutPatient(int id, String name, String visitDate) {
        super(id, name);
        this.visitDate = visitDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Visit Date: " + visitDate);
    }
}

