package com.codurance.apprentice.kata.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYearShould {
    @Test
    void returnFalseWhenYearIs1() {
        LeapYear leapYear = new LeapYear();
        boolean isLeapYear = leapYear.isLeapYear(1);

        assertFalse(isLeapYear);
    }
}
