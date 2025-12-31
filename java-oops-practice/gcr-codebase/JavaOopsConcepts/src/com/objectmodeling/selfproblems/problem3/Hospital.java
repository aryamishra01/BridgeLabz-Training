package com.objectmodeling.selfproblems.problem3;

import java.util.ArrayList;
import java.util.List;

// Hospital contains doctors and patients
// Acts as a container but does not control their life cycle
public class Hospital {

    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Adds doctor to hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Adds patient to hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Displays hospital details
    public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);

        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
