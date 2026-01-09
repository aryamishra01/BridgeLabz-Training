package com.day8.skillforge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course implements ICertifiable{

	protected String title;
	protected Instructor instructor;
	protected int rating;
	private List<String> modules;
	private final String[] internalReviews;
	
	public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = Arrays.asList("Module1", "Module2", "Module3");
        this.rating = 0;
        this.internalReviews = new String[]{"Great content", "Needs update"};
    }
	
	public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0;
        this.internalReviews = new String[]{"Great content", "Needs update"};
    }
	
	public String getTitle() {
	     return title;
	}

	public List<String> getModules() {
	     return modules;
	}
	
	
	// Encapsulation: only allow internal rating calculation
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5)
            this.rating = (int) newRating;
    }

    public double getRating() {
        return rating;
    }
    
    public void showCourseDetails() {
        System.out.println("\n************ COURSE DETAILS ************");
        System.out.println("Title      : " + title);
        System.out.println("Instructor : " + instructor.getName());
        System.out.println("Modules    : " + modules);
        System.out.println("Rating     : " + rating + "/5.0");
        System.out.println("****************************************");
    }

    // Polymorphic certificate based on grade
    @Override
    public void generateCertificate(Student student) {
        System.out.println("\nCERTIFICATE STATUS");
        if (student.getGrade() >= 90) {
            System.out.println("GOLD Certificate - Excellent Performance");
        } else if (student.getGrade() >= 75) {
            System.out.println("SILVER Certificate - Very Good");
        } else if (student.getGrade() >= 50) {
            System.out.println("BRONZE Certificate - Pass");
        } else {
            System.out.println("Certificate Not Awarded");
        }
    }

    // Read-only internal reviews
    public void showInternalReviews() {
        System.out.println("\n[Internal Reviews - Read Only]");
        for (String review : internalReviews) {
            System.out.println("- " + review);
        }
    }
    
    public void submitRating(Student student, double newRating) {
        if (student.getProgress() == 100) {
            updateRating(newRating); // protected logic
            System.out.println("Rating submitted successfully!");
        } else {
            System.out.println("Complete the course to submit rating.");
        }
    }

}
