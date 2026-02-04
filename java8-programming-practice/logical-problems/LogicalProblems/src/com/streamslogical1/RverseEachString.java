/*
reverse each string in list
Input: ["java","api"]
Output: ["avaj","ipa"]
*/

package com.streamslogical1;

import java.util.List;
import java.util.stream.Collectors;

public class RverseEachString {

	public static void main(String[] args) {
		
		List<String> str = List.of("java" , "api");
		
		List<String> reverseStr = str.stream()
									 .map(s -> new StringBuilder(s).reverse().toString())
									 .collect(Collectors.toList());
		
		System.out.println(reverseStr);

	}

}
