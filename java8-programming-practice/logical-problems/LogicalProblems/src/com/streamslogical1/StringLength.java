/*
Find string length list
Input: ["cat","elephant","dog"]
Output: [3,8,3]
*/

package com.streamslogical1;

import java.util.List;

public class StringLength {

	public static void main(String[] args) {
		
		List<String> list= List.of("cat", "elephant", "dog");
		
		List<Integer> count = list.stream()
								  .map(String :: length)
								  .toList();
		System.out.print(count);
	}
}
