/*
Find duplicate elements only
Input: [1,2,3,2,4,5,1]
Output: [1,2]
*/
package com.streamslogical1;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1,2,3,2,4,5,1);
		
		Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates =
					                nums.stream()
					                    .collect(Collectors.groupingBy(
					                    		n -> n,
					                    		LinkedHashMap :: new,
					                    		Collectors.counting()
					                 ))
					                 .entrySet()
					                 .stream()
					                 .filter( e -> e.getValue() > 1)
					                 .map(Map.Entry :: getKey)
					                 .collect(Collectors.toList());
        
        System.out.println(duplicates);

	}

}
