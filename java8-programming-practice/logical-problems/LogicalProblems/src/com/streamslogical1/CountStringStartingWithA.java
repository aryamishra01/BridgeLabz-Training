/*
Count strings starting with ‘a’
Input: ["apple","banana","ant","car"]
Output: 2
*/

package com.streamslogical1;

import java.util.List;

public class CountStringStartingWithA {

	public static void main(String[] args) {
		
		List<String> list = List.of("apple","banana","ant", "car");
		
		long count = list.stream()
						 .filter(s -> s.startsWith("a"))
						 .count();
		System.out.println(count);
	}

}
