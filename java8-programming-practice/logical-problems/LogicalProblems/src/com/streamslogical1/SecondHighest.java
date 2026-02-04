/*
Find second highest number
Input: [10,40,30,20]
Output: 30
*/

package com.streamslogical1;

import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,40,30,20);
		
		int secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(secondLargest);

	}

}
