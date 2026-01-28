package com.Junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Junit.main.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        int result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(4, 5);
        assertEquals(20, result);
    }

    @Test
    void testDivide() {
        int result = calculator.divide(20, 5);
        assertEquals(4, result);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

