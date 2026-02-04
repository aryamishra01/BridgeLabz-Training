/*
Find even numbers from list
Input: [2,5,7,8,10,13]
Output: [2,8,10]
*/

package com.streamslogical1;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		numbers.add(13);
		
		System.out.println("List of numbers : " +numbers);
		
		List<Integer> evenNumber = numbers.stream()
										   .filter(c -> c%2 == 0)
										   .toList();
		
		System.out.print(evenNumber);
			   
	}
}
