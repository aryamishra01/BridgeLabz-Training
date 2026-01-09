package com.day8.skillforge;

//Student inherits User
class Student extends User {
	 private double progress; // 0 - 100
	 private double grade;    // 0 - 100
	
	 public Student(String name) {
	     super(name);
	     this.progress = 0;
	     this.grade = 0;
	 }
	
	 public double getProgress() {
	     return progress;
	 }
	
	 public void completeModule(double moduleProgress) {
	     progress += moduleProgress;
	     if (progress > 100) progress = 100;
	 }
	
	 public double getGrade() {
	     return grade;
	 }
	
	 public void updateGrade(double grade) {
	     this.grade = grade;
	 }
}

