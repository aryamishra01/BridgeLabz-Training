/*
Find first non-repeated character
Input: "stress"
Output: t
*/

package com.streamslogical1;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		
		String str = "stress";
		
		Character result =
                str.chars()
                   .mapToObj(c -> (char) c)
                   .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                   .findFirst()
                   .orElse(null);

        System.out.println(result);

	}

}
