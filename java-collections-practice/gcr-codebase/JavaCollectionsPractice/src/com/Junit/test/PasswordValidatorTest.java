package com.Junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Junit.main.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private PasswordValidator validator;

    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
    }

    // Valid passwords
    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("Hello123A"));
    }

    // Less than 8 characters
    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Abc12"));
    }

    // No uppercase letter
    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    // No digit
    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    // Null password
    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}

