package org.example.checkRecord;

class Solution {
    public boolean checkRecord(String s) {
        // start with an array of chars of s
        // initialize two variables : numberOfAbsence and numberOfLateTimes with zero
        // for each s[i]
            // if s[i] equals 'L' numberOfLateTimes++
                // then check if numberOfLateTimes > 2
                    // if true return false
            // else if s[i] equals 'A'
                // increment numberOfAbsence by one
                // check if it is greater then or equal to 2
                    // if true return false
            // else
            // reset numberOfLateTimes

        char[] chars = s.toCharArray();

        int numberOfAbsence = 0;
        int numberOfLateTimes = 0;

        for (char c : chars) {
            if (c == 'L') {
                numberOfLateTimes++;
                if (numberOfLateTimes > 2) {
                    return false;
                }
            } else if (c == 'A') {
                numberOfAbsence++;
                if (numberOfAbsence >= 2) {
                    return false;
                }
                numberOfLateTimes = 0;
            } else {
                numberOfLateTimes = 0;
            }
        }
        return true;
    }
}