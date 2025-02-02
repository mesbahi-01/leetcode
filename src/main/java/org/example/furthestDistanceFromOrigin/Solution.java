package org.example.furthestDistanceFromOrigin;

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int LCounter = 0;
        int RCounter = 0;
        int _Counter = 0;

        for (char c :
                moves.toCharArray()) {
            if (c == 'L') {
                LCounter++;
            }
            else if (c == 'R') {
                RCounter++;
            } else {
                _Counter++;
            }
        }

        return Math.max(
                Math.abs(RCounter - LCounter - _Counter),
                Math.abs(RCounter -LCounter + _Counter)
        );
    }
}