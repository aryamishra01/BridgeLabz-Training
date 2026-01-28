package com.Junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Junit.main.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    // -------- reverse() Tests --------

    @Test
    void testReverseNormalString() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    void testReverseSingleCharacter() {
        assertEquals("a", stringUtils.reverse("a"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testReverseNull() {
        assertNull(stringUtils.reverse(null));
    }

    // -------- isPalindrome() Tests --------

    @Test
    void testPalindromeTrue() {
        assertTrue(stringUtils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(stringUtils.isPalindrome("nurses run"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testPalindromeNull() {
        assertFalse(stringUtils.isPalindrome(null));
    }

    // -------- toUpperCase() Tests --------

    @Test
    void testToUpperCaseNormal() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }

    @Test
    void testToUpperCaseMixedCase() {
        assertEquals("JAVA", stringUtils.toUpperCase("JaVa"));
    }

    @Test
    void testToUpperCaseEmpty() {
        assertEquals("", stringUtils.toUpperCase(""));
    }

    @Test
    void testToUpperCaseNull() {
        assertNull(stringUtils.toUpperCase(null));
    }
}

