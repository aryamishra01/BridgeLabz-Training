package com.Junit.main;

public class StringUtils {

    // Reverse a string
    public String reverse(String str) {
        if (str == null) return null;

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Check palindrome
    public boolean isPalindrome(String str) {
        if (str == null) return false;

        String clean = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = reverse(clean);
        return clean.equals(reversed);
    }

    // Convert to uppercase
    public String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}

