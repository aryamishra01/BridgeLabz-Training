package com.Junit.test;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.Junit.main.NumberUtils;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    private final NumberUtils numberUtils = new NumberUtils();

    // Test even numbers
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEvenTrue(int number) {
        assertTrue(numberUtils.isEven(number));
    }

    // Test odd numbers
    @ParameterizedTest
    @ValueSource(ints = {7, 9, 11})
    void testIsEvenFalse(int number) {
        assertFalse(numberUtils.isEven(number));
    }
}
