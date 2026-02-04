/*
 
Count number of words in a sentence
Input: "Java is very powerful"
Output: 4

*/

package com.streamslogical1;

import java.util.Arrays;

public class CountNumberOfWords {

	public static void main(String[] args) {
		
		String str = "Java is very powerful";
		
		long countWords = Arrays.asList(str.split(" ")).stream().filter(word -> !word.isEmpty()).count();
		
		System.out.println(countWords);
	}

}
