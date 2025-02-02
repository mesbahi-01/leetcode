package org.example.minimizedStringLength;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int minimizedStringLength(String s) {
        // return number of unique chars in s
        int numberOfUniqueChars = calculateUniqueChars(s);
        return numberOfUniqueChars;
    }

    private int calculateUniqueChars(String s) {
        boolean[] chars = new boolean[26];

        for (char c :
                s.toCharArray()) {
            chars[c - 'a'] = true;
        }

        int counter = 0;

        for (boolean b :
                chars) {
            if (b) counter++;
        }
        return counter;

    }
}