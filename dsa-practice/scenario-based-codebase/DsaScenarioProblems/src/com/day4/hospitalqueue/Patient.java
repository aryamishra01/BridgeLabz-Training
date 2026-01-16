package com.day4.hospitalqueue;

public class Patient {

	String name;
    int arrivalTime;
    int criticality;

    // Constructor to initialize patient details
    Patient(String name, int arrivalTime, int criticality) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.criticality = criticality;
    }
}
