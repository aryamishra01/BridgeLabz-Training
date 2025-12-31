package com.objectmodeling.selfproblems.problem3;

import java.util.ArrayList;
import java.util.List;

// Patient class represents a person receiving treatment
// Association: A patient can consult multiple doctors
public class Patient {

    private int patientId;
    private String name;
    private List<Doctor> doctors;

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Adds doctor to patient's consultation list
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Displays doctors consulted by this patient
    public void showDoctors() {
        System.out.println("Doctors consulted by " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }

    public String getName() {
        return name;
    }
}

