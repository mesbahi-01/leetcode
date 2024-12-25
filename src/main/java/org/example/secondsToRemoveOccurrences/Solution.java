package org.example.secondsToRemoveOccurrences;

class Solution {
    // 001011
    // 010011
    //
    public int secondsToRemoveOccurrences(String s) {
        //01 10 10 1

        //10 10 10 1

        int secondsToRemoveOccurrences = 0;
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == '0' && array[i + 1] == '1') {
                array[i] = '1';
                array[i + 1] = '0';
                secondsToRemoveOccurrences++;
            }
        }
        return secondsToRemoveOccurrences;
    }
}