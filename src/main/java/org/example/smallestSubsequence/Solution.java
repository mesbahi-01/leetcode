package org.example.smallestSubsequence;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public String smallestSubsequence(String s) {
        Set<Character> result = new HashSet<>();
        Character lastAddedcharcter = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            // add s.charAt(i) if result is empty or
            if (result.contains(s.charAt(i))){
                continue;
            } else if (result.isEmpty() || lastAddedcharcter < s.charAt(i)){
                result.add(s.charAt(i));
                lastAddedcharcter = s.charAt(i);
            } else {
                result.clear();
            }
        }
        return result.stream().map(String::valueOf).collect(Collectors.joining(""));    }
}