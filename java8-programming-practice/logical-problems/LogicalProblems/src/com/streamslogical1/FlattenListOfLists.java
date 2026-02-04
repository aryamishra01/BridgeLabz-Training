/*
Flatten list of lists
Input: [[1,2],[3,4],[5]]
Output: [1,2,3,4,5]
*/

package com.streamslogical1;

import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfLists {

	public static void main(String[] args) {
		
		List<List<Integer>> list = List.of(
									List.of(1,2),
									List.of(3,4),
									List.of(5));
		
		List<Integer> flattenList = list.stream()
										.flatMap(List :: stream)
										.collect(Collectors.toList());
		
		System.out.println(flattenList);
	}

}
