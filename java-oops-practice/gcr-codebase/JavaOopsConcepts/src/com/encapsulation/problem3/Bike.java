package com.encapsulation.problem3;

public class Bike extends Vehicle implements Insurable {

    public Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Lower insurance for bikes
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getInsurancePolicyNumber();
    }
}
