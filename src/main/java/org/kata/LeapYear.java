package org.kata;

public class LeapYear {
    private final int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean checkLeapYear() {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }
}
