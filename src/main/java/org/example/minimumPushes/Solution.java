package org.example.minimumPushes;

class Solution {
    public int minimumPushes(String word) {
        int numberOfButtons = 8;
        int remainingChars = word.length();
        int totalNumberOfPushes = 0;

        int numberOfPushes = 0;
        while (remainingChars > 0) {
            numberOfPushes++;
            if (remainingChars <= 8)
                totalNumberOfPushes += numberOfPushes * remainingChars;
            else
                totalNumberOfPushes += numberOfPushes * numberOfButtons ;
            remainingChars -= numberOfButtons;
        }

        return totalNumberOfPushes ;
    }// 123
}