package com.encapsulation.problem7;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient implements MedicalRecord {

	protected int patientId;
	protected String name;
	protected int age;
	
	private String diagnosis;
	private List<String> medicalHistory = new ArrayList<>();
	
	public Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	
	public abstract double calculateBill();
	
	public void getPatientDetails() {

		System.out.println("Patient Id : "+patientId);
		System.out.println("Patient Name : "+name);
		System.out.println("Patient Age : "+age);
	}
	
	// Encapsulation - setter & getter
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

	// Interface method implementations
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}
