/*
Join strings with comma
Input: ["Java","Spring","Boot"]
Output: "Java,Spring,Boot"
*/

package com.streamslogical1;

import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithComma {

	public static void main(String[] args) {
		
		List<String> list = List.of("Java", "Spring", "Boot");
		
		String finalList = list.stream().collect(Collectors.joining(","));
		
		System.out.println(finalList);

	}

}

