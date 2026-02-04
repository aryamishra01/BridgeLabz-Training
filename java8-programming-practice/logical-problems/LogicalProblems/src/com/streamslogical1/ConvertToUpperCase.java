/*
Convert list of strings to uppercase
Input: ["java","spring","boot"]
Output: ["JAVA","SPRING","BOOT"]
*/

package com.streamslogical1;

import java.util.List;

public class ConvertToUpperCase {

	public static void main(String[] args) {
		
		List<String> list = List.of("java","spring","boot");
		
		List<String> upperCase = list.stream()
									.map(String :: toUpperCase)
									.toList();
		
		System.out.println(upperCase);
		
	}

}
