package org.example.daysBetweenDates;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        // convert the two dates to days and return the difference
        return Math.abs(toDays(date1) - toDays(date2));
    }

    private int toDays(String date) {
        String[] yyyy_mm_dd = date.split("-");

        int days = Integer.parseInt(yyyy_mm_dd[2]);

        int[] days_of_months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(yyyy_mm_dd[0]);
        if (isLeapYear(year)) {
            days_of_months[1] = 29;
        }


        for (int i = 1; i < Integer.parseInt(yyyy_mm_dd[1]); i++) {
            days += days_of_months[i - 1];
        }
        days += year * 365;
        days += year / 4 - year / 100 + year / 400;

        if (Integer.parseInt(yyyy_mm_dd[1]) <= 2) {
            days--;
        }

        return days;
    }

    private boolean isLeapYear(int i) {

        if (i % 4 == 0) {
            if (i % 100 == 0) {
                if (i % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

}