package org.example.squareIsWhite;

class Solution {
    public boolean squareIsWhite(String coordinates) {
        int character = coordinates.charAt(0) - 'a' + 1;
        int digit = coordinates.charAt(1) - '0';

        return !isOdd(character);

    }

    private boolean isOdd(int digit) {
        return digit % 2 == 1;
    }
}