package com.inheritance.singleinheritance.problem1;

public class DemonstratesSingleInheritance {

	    public static void main(String[] args) {

	        Author author = new Author(
	            "Java Fundamentals",
	            "2024",
	            "Herbert Schildt",
	            "Java programming expert and author"
	        );
	        
	        //Calling display method of author class
	        author.displayInfo();
	    }
}
