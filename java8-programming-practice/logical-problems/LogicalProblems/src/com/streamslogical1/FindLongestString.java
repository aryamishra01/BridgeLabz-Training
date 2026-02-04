/*
Find longest string
Input: ["java","microservices","api"]
Output: "microservices"
*/

package com.streamslogical1;

import java.util.Comparator;
import java.util.List;

public class FindLongestString {

	public static void main(String[] args) {
		
		List<String> list = List.of("java","microservices","api");
		
		String longest = list.stream().max(Comparator.comparingInt(String :: length)).orElse(null);
		
		System.out.println(longest);

	}

}
