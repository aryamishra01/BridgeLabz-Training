/*
Frequency of each character
Input: "banana"
Output: {b=1, a=3, n=2}
*/

package com.streamslogical1;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCount {

	public static void main(String[] args) {
		
		String str = "banana";
		
		Map<Character,Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));

		System.out.println(map);
	}

}
