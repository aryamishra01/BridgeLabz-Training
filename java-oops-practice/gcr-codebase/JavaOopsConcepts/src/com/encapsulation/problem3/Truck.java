package com.encapsulation.problem3;

public class Truck extends Vehicle implements Insurable {

    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate, policyNo);
    }

    // Higher rental cost calculation
    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 500; // service charge
    }

    // Higher insurance
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getInsurancePolicyNumber();
    }
}
