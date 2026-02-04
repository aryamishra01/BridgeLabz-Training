/*
Find numbers greater than 50
Input: [10,55,60,23,90]
Output: [55,60,90]
*/

package com.streamslogical1;

import java.util.List;

public class NumbersGreaterThan50 {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(10,55,60,23,90);
		
		List<Integer> result = numbers.stream()
									  .filter(c -> c > 50)
									  .toList();
		System.out.println(result);

	}

}
