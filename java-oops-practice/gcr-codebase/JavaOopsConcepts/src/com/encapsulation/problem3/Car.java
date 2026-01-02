package com.encapsulation.problem3;

public class Car extends Vehicle implements Insurable {

    public Car(String number, double rate, String policyNo) {
        super(number, "Car", rate, policyNo);
    }

    // Rental cost = daily rate × days
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Insurance = 10% of monthly rental
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
}
