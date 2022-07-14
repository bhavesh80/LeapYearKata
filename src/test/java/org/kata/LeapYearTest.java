package org.kata;

import org.kata.LeapYear;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    // Divisible by 400 - Leap year  - 2000
    // Divisible by 100 & !400  - Not Leap year   - 1700, 1800, 1900
    // Divisible by 4 & !100 - Leap year   - 2008,2012,2016
    // Divisible by !4 = not leap year  - 2017,2018,2019


    @Test
    public void divisibleBy400(){
        LeapYear lp = new LeapYear(2000);
        assertTrue(lp.checkLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {1700,1800,1900})
    public void divisibleBy100andNot400(int year){
        LeapYear lp = new LeapYear(year);
        assertFalse(lp.checkLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {2008,2012,2016})
    public void divisibleBy4andNot100(int year){
        LeapYear lp = new LeapYear(year);
        assertTrue(lp.checkLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {2017,2018,2019})
    public void notDivisibleBy4(int year){
        LeapYear lp = new LeapYear(year);
        assertFalse(lp.checkLeapYear());
    }

}
