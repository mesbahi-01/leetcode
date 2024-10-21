package org.example.canBeTypedWords;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> setOfBrokenLetters = new HashSet<>();

        for (char c : brokenLetters.toCharArray()) {
            setOfBrokenLetters.add(c);
        }
        int counter = 0;
        for (int i = 0; i < text.length(); ) {
            if (text.charAt(i) == ' ' || (i == text.length() - 1 && !setOfBrokenLetters.contains(text.charAt(i))))  {
                counter++;
            } else if (setOfBrokenLetters.contains(text.charAt(i))) {
                i = text.indexOf(" ", i + 1);
                if (i == -1) i = text.length();
            }
            i++;
        }
        return counter;
    }
}