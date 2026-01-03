package com.encapsulation.problem7;

public class InPatient extends Patient {

	private int numberOfDays;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age, int numberOfDays, double dailyCharge) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * dailyCharge;
    }
}
