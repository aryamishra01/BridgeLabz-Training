/*
Convert List<Integer> to List<String>
Input: [1,2,3]
Output: ["1","2","3"]
*/

package com.streamslogical1;

import java.util.List;
import java.util.stream.Collectors;

public class ListIntegerToListString {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1,2,3);
		
		String str = nums.stream()
						.map(s -> "\"" + s + "\"")
		                .collect(Collectors.joining(",", "[", "]"));

		System.out.println(str);

	}

}
