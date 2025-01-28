package org.example.maximumValue;

class Solution {
    public int maximumValue(String[] strs) {
        int maximumValueOfAString = -1;

        for (String str :
                strs) {
            if (isPureNumeric(str)) {
                maximumValueOfAString = Math.max(maximumValueOfAString,
                        Integer.parseInt(str));
            } else {
                maximumValueOfAString = Math.max(maximumValueOfAString,
                        str.length());
            }
        }
        return maximumValueOfAString;
    }

    private boolean isPureNumeric(String str) {
        for (char c :
                str.toCharArray()) {
            if (c < '0' || c > '9') return false;
        }
        return true;
    }
}