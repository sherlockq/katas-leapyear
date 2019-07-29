package com.codurance.apprentice.kata.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 2019, 1997})
    void returnFalseIfNotDivisibleBy4(int year) {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(year);

        assertFalse(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 1996})
    void returnTrueIfDivisibleBy4(int year) {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(year);

        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 200, 300, 1800})
    void returnFalseIfDivisibleBy100(int year) {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(year);

        assertFalse(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 1600})
    void returnTrueIfDivisibleBy400(int year) {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(year);

        assertTrue(isLeapYear);
    }
}
