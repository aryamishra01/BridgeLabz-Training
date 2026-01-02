package com.encapsulation.problem3;

public abstract class Vehicle {

    // Encapsulated fields
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Sensitive information (encapsulated)
    private String insurancePolicyNumber;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNumber;
    }

    // Getters and setters (Encapsulation)

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Insurance policy should not be directly accessible
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    protected void updateInsurancePolicy(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }

    /*
     * Abstract method for rental cost calculation
     */
    public abstract double calculateRentalCost(int days);
}
