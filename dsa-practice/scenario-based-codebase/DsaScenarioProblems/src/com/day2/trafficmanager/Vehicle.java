package com.day2.trafficmanager;

class Vehicle {
    String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return vehicleNumber;
    }
}

