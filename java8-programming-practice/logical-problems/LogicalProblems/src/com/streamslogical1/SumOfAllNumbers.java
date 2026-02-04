/*
Sum of all numbers using stream
Input: [1,2,3,4,5]
Output: 15
*/

package com.streamslogical1;

import java.util.List;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,4,5);
		
		int sum = numbers.stream()
						  .mapToInt(Integer :: intValue)
						  .sum();
		System.out.println(sum);
	}

}
