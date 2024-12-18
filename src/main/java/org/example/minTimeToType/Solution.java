package org.example.minTimeToType;

class Solution {
    public int minTimeToType(String word) {
        // x y z  || a b c
        int minimumTimeToType = 0;
        int timeToType = 1;

        char previous = 'a';
        for (int i = 0; i < word.length(); i++) {
            minimumTimeToType += timeToMoveFromTo(previous, word.charAt(i)) + timeToType;

            previous = word.charAt(i);
        }
        return minimumTimeToType;
    }

    private int timeToMoveFromTo(char c1, char c2) {
        /// clockewise =
        int timeInClockWise = Math.abs( c1 - c2);

        int counterClockWise = (26 - timeInClockWise);

        return Math.min(Math.abs(timeInClockWise),counterClockWise);

    }
}