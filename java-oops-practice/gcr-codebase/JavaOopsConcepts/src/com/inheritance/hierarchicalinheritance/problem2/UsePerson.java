package com.inheritance.hierarchicalinheritance.problem2;

public class UsePerson {

	public static void main(String[] args) {

        Teacher teacher = new Teacher("Anita Sharma", 35, "Mathematics");
        Student student = new Student("Rahul Verma", 16, "10th Grade");
        Staff staff = new Staff("Suresh Kumar", 45, "Administration");

        System.out.println("---- Teacher Details ----");
        teacher.displayBasicInfo();
        teacher.displayRole();

        System.out.println("\n---- Student Details ----");
        student.displayBasicInfo();
        student.displayRole();

        System.out.println("\n---- Staff Details ----");
        staff.displayBasicInfo();
        staff.displayRole();
    }
}
