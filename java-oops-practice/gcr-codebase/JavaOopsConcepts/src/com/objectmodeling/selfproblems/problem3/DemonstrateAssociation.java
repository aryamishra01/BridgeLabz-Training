package com.objectmodeling.selfproblems.problem3;

public class DemonstrateAssociation {

		public static void main(String[] args) {

	        // Create hospital
	        Hospital hospital = new Hospital("City Care Hospital");

	        // Create doctors
	        Doctor d1 = new Doctor(101, "Dr. Sharma");
	        Doctor d2 = new Doctor(102, "Dr. Mehta");

	        // Create patients
	        Patient p1 = new Patient(1, "Aarav");
	        Patient p2 = new Patient(2, "Riya");

	        // Add doctors and patients to hospital
	        hospital.addDoctor(d1);
	        hospital.addDoctor(d2);

	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        // Communication between doctor and patient (association)
	        d1.consult(p1);
	        p1.addDoctor(d1);

	        d1.consult(p2);
	        p2.addDoctor(d1);

	        d2.consult(p1);
	        p1.addDoctor(d2);

	        System.out.println();

	        // Display relationships
	        d1.showPatients();
	        System.out.println();
	        p1.showDoctors();
       }
}


