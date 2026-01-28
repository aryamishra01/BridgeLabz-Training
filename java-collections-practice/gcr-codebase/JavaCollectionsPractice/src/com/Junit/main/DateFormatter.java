package com.Junit.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    private final DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public String formatDate(String inputDate) {
        if (inputDate == null) {
            throw new IllegalArgumentException("Invalid date format: null");
        }
        try {
            LocalDate date = LocalDate.parse(inputDate, inputFormatter);
            return date.format(outputFormatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format: " + inputDate);
        }
    }
}


