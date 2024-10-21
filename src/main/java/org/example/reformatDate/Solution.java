package org.example.reformatDate;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reformatDate(String date) {
        String[] dd_mm_yyyy = date.split(" ");

        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        String days = dd_mm_yyyy[0].substring(0,dd_mm_yyyy[0].length() - 2);
        if (days.length() == 1) days = "0" + days;
        return dd_mm_yyyy[2] + "-" + months.get(dd_mm_yyyy[1]) + "-" +days;
    }
}