package com.codurance.apprentice.kata.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {
    @Test
    void returnFalseWhenYearIs1() {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(1);

        assertFalse(isLeapYear);
    }

    @Test
    void returnTrueWhenYearIs4() {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(4);

        assertTrue(isLeapYear);
    }
}
