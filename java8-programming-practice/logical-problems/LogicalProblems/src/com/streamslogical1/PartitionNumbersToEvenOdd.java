/*
Partition numbers into even and odd
Input: [1,2,3,4,5,6]
Output: {even=[2,4,6], odd=[1,3,5]}
*/

package com.streamslogical1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbersToEvenOdd {

	public static void main(String[] args) {
	
		List<Integer> list = List.of(1,2,3,4,5,6);
		
		Map<String, List<Integer>> evenodd = list.stream()
									.collect(Collectors.partitioningBy(n -> n%2 == 0))
									.entrySet()
									.stream()
									.collect(Collectors.toMap(
											e -> e.getKey() ? "even" : "odd",
											Map.Entry :: getValue,
											(a,b) -> a 
									));
		
		System.out.println(evenodd);
	}

}
