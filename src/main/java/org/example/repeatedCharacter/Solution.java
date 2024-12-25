package org.example.repeatedCharacter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> map = new HashSet<>();

        for (int i = 0, charArrayLength = s.length(); i < charArrayLength; i++) {
            char c = s.charAt(i);
            if (map.contains(c)) return c;
            else map.add(c);
        }
        return 0;
    }
}