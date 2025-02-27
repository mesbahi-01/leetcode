package org.example.numberOfSpecialChars2;

import java.util.Arrays;

class Solution {
    public int numberOfSpecialChars(String word) {
        int[] indexOfCharacters = new int[128];

        Arrays.fill(indexOfCharacters, -1);

        int numberOfSpecialChars = 0;

        char[] charArray = word.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if ((c >= 'a' && c <= 'z') || indexOfCharacters[c] == -1) {
                indexOfCharacters[c] = i;
            }
        }

        int latitude = 'a' - 'A';
        for (char c = 'a'; c <= 'z'; c++) {
            if (indexOfCharacters[c] != -1
                    && indexOfCharacters[Character.toUpperCase(c)] != -1
                    && indexOfCharacters[c] < indexOfCharacters[Character.toUpperCase(c)])
                numberOfSpecialChars++;
        }
        return numberOfSpecialChars;
    }
}