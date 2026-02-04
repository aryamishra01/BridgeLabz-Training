/*
Find kth smallest element
Input: [9,1,5,3,7], k=2
Output: 3
*/

package com.streamslogical1;

import java.util.List;

public class FindKthSmallestElement {

	public static void main(String[] args) {

		List<Integer> nums = List.of(9, 1, 5, 3, 7);
        int k = 2;

        int kthSmallest =
                nums.stream()
                    .sorted()
                    .skip(k - 1) 
                    .findFirst()
                    .orElseThrow();

        System.out.println(kthSmallest);

	}

}
