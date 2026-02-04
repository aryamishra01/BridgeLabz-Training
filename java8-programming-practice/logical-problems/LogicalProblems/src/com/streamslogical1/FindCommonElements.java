/*
Find common elements between two lists
Input: [1,2,3,4] and [3,4,5,6]
Output: [3,4]
*/

package com.streamslogical1;

import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {

	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        List<Integer> common =
                list1.stream()
                     .filter(list2::contains)
                     .collect(Collectors.toList());

        System.out.println(common);

	}

}
