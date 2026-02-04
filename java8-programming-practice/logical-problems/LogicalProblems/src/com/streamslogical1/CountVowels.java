/*
 
Count vowels in a string using Stream
Input: "programming"
Output: 3

*/

package com.streamslogical1;

import java.util.Arrays;

public class CountVowels {

	public static void main(String[] args) {
		
		String str = "programming";
		
		long count = Arrays.asList(str.split(""))
						  .stream()
						  .filter(c -> "aeiouAEIOU".indexOf(c) >= 0 )
						  .count();
		System.out.println(count);
	}

}
