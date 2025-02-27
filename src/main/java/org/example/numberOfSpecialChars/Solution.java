package org.example.numberOfSpecialChars;

class Solution {
    public int numberOfSpecialChars(String word) {
        int numberOfSpecialCharacter = 0;
        int[] frequency = new int[128];

        for (char c : word.toCharArray()) {
            frequency[c]++;
        }

        int latitude = 'a' - 'A';

        for (char i = 'a'; i <= 'z'; i++) {
            if (frequency[i] > 0 && frequency[i - latitude] > 0) numberOfSpecialCharacter++;
        }

        return numberOfSpecialCharacter;
    }
}