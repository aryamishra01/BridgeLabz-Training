/*
Find sum of squares of even numbers
Input: [1,2,3,4,5]
Output: 20 (2² + 4²)
*/

package com.streamslogical1;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquaresOfEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1,2,3,4,5);
		
		int squareSum = nums.stream().filter(n -> n%2 == 0).map(n -> n*n).mapToInt(Integer :: intValue).sum();
		
		System.out.println(squareSum);

	}

}
