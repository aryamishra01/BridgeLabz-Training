/*
Remove duplicate elements from list
Input: [1,2,2,3,4,4,5]
Output: [1,2,3,4,5]
*/

package com.streamslogical1;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesElements {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,2,3,4,4,5);
		
		List<Integer> result = list.stream()
								   .distinct()
								   .collect(Collectors.toList());
		
		System.out.println(result);
								   

	}

}
