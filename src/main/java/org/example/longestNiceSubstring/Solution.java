package org.example.longestNiceSubstring;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    // 'a' -> 'A' // add -32
    // 'A' -> 'a' // add 32
    public String longestNiceSubstring(String s) {

        if (s.length() < 2) return "";
        if (isNiceString(s)) return s;

        Set<Character> set = createSetFromString(s);

        int index = -1;

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(revers(s.charAt(i)))) {
                index = i;
                break;
            }
        }
        String s1 = longestNiceSubstring(s.substring(0, index));
        String s2 = longestNiceSubstring(s.substring(index + 1));

        return s1.length() >= s2.length() ? s1 : s2;
    }

    private boolean isNiceString(String s) {
        if (s.length() < 2) return false;
        Set<Character> set = createSetFromString(s);
        for (Character c :
                s.toCharArray()) {
            Character reversedChar = revers(c);
            if (!set.contains(reversedChar)) return false;
        }
        return true;
    }

    private Set<Character> createSetFromString(String s) {
        Set<Character> set = new HashSet<>(s.length());
        for (Character character:
             s.toCharArray()) {
            set.add(character);
        }

        return set;
    }

    private Character revers(Character c) {
        if (c <= 'z' && c >= 'a') {
            return (char) (c - 32);
        } else {
            return (char) (c + 32);
        }
    }
}