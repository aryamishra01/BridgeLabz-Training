package com.Junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Junit.main.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    private UserRegistration registration;

    @BeforeEach
    void setUp() {
        registration = new UserRegistration();
    }

    // Valid registration
    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> 
            registration.registerUser("AryaM", "arya@example.com", "Password123")
        );
    }

    // Invalid username
    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("", "arya@example.com", "Password123")
        );
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    // Invalid email
    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("AryaM", "aryaexample.com", "Password123")
        );
        assertEquals("Invalid email", exception.getMessage());
    }

    // Invalid password
    @Test
    void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("AryaM", "arya@example.com", "pass")
        );
        assertEquals("Password must be at least 8 characters", exception.getMessage());
    }

    // Null values
    @Test
    void testNullValues() {
        assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser(null, null, null)
        );
    }
}

