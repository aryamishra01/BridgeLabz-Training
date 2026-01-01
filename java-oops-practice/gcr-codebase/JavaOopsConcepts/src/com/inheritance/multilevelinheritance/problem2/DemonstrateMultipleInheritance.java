package com.inheritance.multilevelinheritance.problem2;

public class DemonstrateMultipleInheritance {

	public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
            "Java Full Stack",
            120,
            "Udemy",
            true,
            12000,
            20
        );

        course.displayDetails();
    }
}
