package com.encapsulation.problem7;

public class DemonstratePolymorphism {

	public static void main(String[] args) {

        // Polymorphism: Parent reference → Child object
        Patient p1 = new InPatient(101, "Ravi Kumar", 45, 5, 2000);
        Patient p2 = new OutPatient(102, "Anita Sharma", 28, 600);

        // Setting diagnosis (encapsulation)
        p1.setDiagnosis("Pneumonia");
        p2.setDiagnosis("Fever");

        // Adding medical records
        p1.addRecord("Admitted to ICU");
        p1.addRecord("Given antibiotics");

        p2.addRecord("Doctor consultation");
        p2.addRecord("Prescribed medicines");

        System.out.println("===== IN-PATIENT DETAILS =====");
        p1.getPatientDetails();
        System.out.println("Diagnosis: " + p1.getDiagnosis());
        p1.viewRecords();
        System.out.println("Total Bill: ₹" + p1.calculateBill());

        System.out.println("\n===== OUT-PATIENT DETAILS =====");
        p2.getPatientDetails();
        System.out.println("Diagnosis: " + p2.getDiagnosis());
        p2.viewRecords();
        System.out.println("Total Bill: ₹" + p2.calculateBill());
    }
}
