package com.day2.hospitalmanagementsystem;

public class InPatient extends Patient {

    private int numberOfDays;

    public InPatient(int id, String name, String history, int days) {
        super(id, name, history);
        this.numberOfDays = days;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admitted Days: " + numberOfDays);
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}
