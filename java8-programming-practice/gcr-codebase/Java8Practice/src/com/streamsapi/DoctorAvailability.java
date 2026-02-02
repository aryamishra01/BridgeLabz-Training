package com.streamsapi;

import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }
    
    @Override
    public String toString() {
    	return name +" | " +specialty +" | Weekend Available: " +weekendAvailable;
    }
}


public class DoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Rao", "Cardiology", true),
            new Doctor("Dr. Mehta", "Neurology", false),
            new Doctor("Dr. Sharma", "Orthopedic", true)
        );

        doctors.stream()
        	   .filter(d -> d.weekendAvailable)
        	   .sorted(Comparator.comparing(d -> d.specialty))
        	   .forEach(System.out::println);
    }
}

