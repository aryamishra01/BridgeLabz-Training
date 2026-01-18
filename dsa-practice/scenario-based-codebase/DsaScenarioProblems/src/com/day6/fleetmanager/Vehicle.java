package com.day6.fleetmanager;

public class Vehicle {
    String vehicleId;
    int mileage;   // maintenance priority based on mileage

    Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return vehicleId + " - " + mileage + " km";
    }
}

