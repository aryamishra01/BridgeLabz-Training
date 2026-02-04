/*
Remove empty strings
Input: ["java","","spring","","boot"]
Output: ["java","spring","boot"]
*/

package com.streamslogical1;

import java.util.List;

public class RemoveEmptyString {

	public static void main(String[] args) {
		
		List<String> list = List.of("java","","spring","boot");
		
		List<String> result = list.stream()
			.filter(s -> !s.isEmpty())
			.toList();
		System.out.println(result);
	}

}
