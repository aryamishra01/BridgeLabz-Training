package com.objectmodeling.selfproblems.problem3;

import java.util.ArrayList;
import java.util.List;

// Doctor class represents a medical professional
// Association: A doctor can consult multiple patients
public class Doctor {

    private int doctorId;
    private String name;
    private List<Patient> patients;

    public Doctor(int doctorId, String name) {
        this.doctorId =doctorId;
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Communication between Doctor and Patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }

        System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
    }

    // Displays all patients consulted by this doctor
    public void showPatients() {
        System.out.println("Patients consulted by Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }

    public String getName() {
        return name;
    }
}
