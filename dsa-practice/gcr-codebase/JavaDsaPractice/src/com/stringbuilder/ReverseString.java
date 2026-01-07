package com.stringbuilder;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String stringInput = sc.nextLine();
		
		// Create StringBuilder object
		StringBuilder obj = new StringBuilder();
		
		// Append the input string to StringBuilder
		obj.append(stringInput);
		
		// Reverse the string using reverse() method
		obj.reverse();
		
		// Convert StringBuilder back to String
		String reversedString = obj.toString();
		
		//Print reversed string
		System.out.println("Reversed String : "+reversedString);
		
	}
}
