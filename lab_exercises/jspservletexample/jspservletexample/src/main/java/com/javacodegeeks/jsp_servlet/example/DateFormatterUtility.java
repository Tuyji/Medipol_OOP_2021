package com.javacodegeeks.jsp_servlet.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public final class DateFormatterUtility {

    private static final DateTimeFormatter INSTANCE = DateTimeFormatter.ofPattern("yyyy MM dd");

    private DateFormatterUtility() {
        throw new IllegalStateException("Instantiation not allowed");
    }

    static String format(final LocalDate date) {
        assert !Objects.isNull(date) : "Date required for formatting";

        // Database kayıt alma
        // Kayıtları tabloya at
        // return;

        return date.format(INSTANCE);
    }
}
