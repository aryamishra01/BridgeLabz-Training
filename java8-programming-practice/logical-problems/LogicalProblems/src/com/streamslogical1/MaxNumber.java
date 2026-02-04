/*
Find max number
Input: [10,25,3,99,45]
Output: 99
*/

package com.streamslogical1;

import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,25,3,99,45);
		
		Integer max = list.stream()
						.max(Integer :: compareTo)
						.get();
		
		System.out.println(max);
		
			
	}

}
