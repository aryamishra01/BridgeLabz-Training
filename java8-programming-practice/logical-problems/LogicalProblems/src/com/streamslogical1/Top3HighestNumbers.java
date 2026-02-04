/*
Find top 3 highest numbers
Input: [10,90,30,70,50]
Output: [90,70,50]
*/

package com.streamslogical1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top3HighestNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,90,30,70,50);
		
		List<Integer> listResult = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		
		System.out.println(listResult);

	}

}
