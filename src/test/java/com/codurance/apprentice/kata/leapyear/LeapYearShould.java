package com.codurance.apprentice.kata.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 2019})
    void returnFalseIfNotDivisibleBy4(int year) {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(year);

        assertFalse(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12})
    void returnTrueIfDivisibleBy4(int year) {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(year);

        assertTrue(isLeapYear);
    }

    @Test
    void returnFalseIfYearIs100() {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(100);

        assertFalse(isLeapYear);
    }

    @Test
    void returnFalseIfYearIs200() {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(200);

        assertFalse(isLeapYear);
    }

    @Test
    void returnFalseIfYearIs300() {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(300);

        assertFalse(isLeapYear);
    }
}
