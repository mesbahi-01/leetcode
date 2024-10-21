package org.example.dayOfYear;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int dayOfYear(String date) {
        // first parse the date using '-'
        // initialize day_number_in_year to date.day
        // create a map month_number_of_days
        // for each month
            // day_number_in_year += month_number_of_days[month]
        // if date.year is leap
            //day_number_in_year++
        // return day_number_in_year;
        String[] date_parsed = date.split("-");
        int day_number_in_year = Integer.parseInt(date_parsed[2]);
        int[] days_of_months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        if(isLeapYear(Integer.parseInt(date_parsed[0]))){
            days_of_months[1] = 29;
        }

        for(int i = 1; i < Integer.parseInt(date_parsed[1]); i++){
            day_number_in_year += days_of_months[i-1];
        }

        return day_number_in_year;
    }

    private boolean isLeapYear(int i) {

        if(i % 4 == 0){
            if(i % 100 == 0){
                if(i % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}