/*
Count occurrences of each word
Input: "java is java and java is fast"
Output: {java=3, is=2, and=1, fast=1}
*/

package com.streamslogical1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurencesOfWord {

	public static void main(String[] args) {
		
		String str = "java is java and java is fast";

		Map<String, Long> mappedValues = Arrays.stream(str.split(" "))
											   .collect(Collectors.groupingBy(
													   word -> word,
													   LinkedHashMap :: new,
													   Collectors.counting()
										));
		
		System.out.println(mappedValues);
											   
	}

}
