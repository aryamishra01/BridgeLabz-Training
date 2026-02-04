/*
Group strings by length
Input: ["a","bb","ccc","dd"]
Output: {1=[a], 2=[bb,dd], 3=[ccc]}
*/

package com.streamslogical1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {

	public static void main(String[] args) {
		
		List<String> str = List.of("a","bb","ccc","dd");
		
		Map<Integer, List<String>> result =
                							str.stream()
                							   .collect(Collectors.groupingBy(String::length));

        System.out.println(result);

	}

}
