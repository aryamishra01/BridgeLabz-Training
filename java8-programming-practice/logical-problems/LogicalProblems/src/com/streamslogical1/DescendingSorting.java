/*
sort list in descending order
Input: [5,1,9,3]
Output: [9,5,3,1]
*/

package com.streamslogical1;

import java.util.Comparator;
import java.util.List;

public class DescendingSorting {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(5,1,9,3);
		
		List<Integer> reverseList = list.stream().sorted(Comparator.reverseOrder()).toList();
		
		System.out.println(reverseList);

	}

}
