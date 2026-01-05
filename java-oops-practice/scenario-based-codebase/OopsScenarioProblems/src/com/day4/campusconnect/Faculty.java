package com.day4.campusconnect;

//Faculty Class
class Faculty extends Person {

	 Faculty(int id, String name, String email) {
	     super(id, name, email);
	 }
	
	 @Override
	 void printDetails() {
	     super.printDetails();
	     System.out.println("Role: Faculty");
	 }
}
