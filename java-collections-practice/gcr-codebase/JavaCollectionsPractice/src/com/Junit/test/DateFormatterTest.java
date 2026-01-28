package com.Junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Junit.main.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    private DateFormatter dateFormatter;

    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    @Test
    void testValidDate() {
        assertEquals("25-01-2026", dateFormatter.formatDate("2026-01-25"));
        assertEquals("01-12-2025", dateFormatter.formatDate("2025-12-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate("25/01/2026");
        });
        assertTrue(exception.getMessage().contains("Invalid date format"));
    }

    @Test
    void testNullDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate(null);
        });
        assertTrue(exception.getMessage().contains("Invalid date format"));
    }
}
