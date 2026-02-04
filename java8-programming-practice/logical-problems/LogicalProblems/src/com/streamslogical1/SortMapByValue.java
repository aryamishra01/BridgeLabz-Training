/*
Sort map by value
Input: {A=3, B=1, C=2}
Output: {B=1, C=2, A=3}
*/

package com.streamslogical1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A",3);
		map.put("B",1);
		map.put("C", 2);
		
		Map<String, Integer> sortmap = map.entrySet()
										  .stream()
										  .sorted(Map.Entry.comparingByValue())
										  .collect(Collectors.toMap(
												  Map.Entry:: getKey,
												  Map.Entry :: getValue,
												  (a,b) -> a, LinkedHashMap :: new));
		
		System.out.println(sortmap);
		
	}

}
