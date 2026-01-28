package com.Junit.test;

import org.junit.jupiter.api.Test;

import com.Junit.main.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    // Test normal division
    @Test
    void testDivideSuccess() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.divide(20, 4);
        assertEquals(5, result);
    }

    // Test exception when dividing by zero
    @Test
    void testDivideByZeroException() {
        MathUtils mathUtils = new MathUtils();

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> mathUtils.divide(10, 0)
        );

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}

