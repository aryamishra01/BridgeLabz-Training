package com.day2.hospitalmanagementsystem;

public class Patient {

    private int patientId;
    private String name;
    private String medicalHistory; // sensitive → private
    protected String type;

    // Normal admission constructor
    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.type = "Normal";
    }

    // Emergency admission constructor
    public Patient(int patientId, String name, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
        this.type = "Emergency";
    }

    // Getter & Setter (Encapsulation)
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Polymorphic method
    public void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

    // Public safe summary
    public String getSummary() {
        return "Patient: " + name + " | Type: " + type;
    }
}
