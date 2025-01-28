package org.example.vowelStrings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int counter = 0;
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o','u'));
        for (int i = left; i <= right; i++) {
            String currentString = words[i];
            if (vowels.contains(currentString.charAt(0)) &&
                    vowels.contains(currentString.charAt(currentString.length() - 1)))
                counter++;
        }
        return counter;
    }
}