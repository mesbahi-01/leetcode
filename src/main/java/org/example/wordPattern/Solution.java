package org.example.wordPattern;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // split s into a list of strings
        // declare a map of string,char
        // declare a counter i and initialize it to 0
        // foreach item of the list
        // if map contains the item
            // if map[item] != pattern[i]
                // return false
        // else if map.containsValue(patter[i]) return false
        // else
            // increment i;
        // return true

        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        Map<String, Character> map = new HashMap<>();
        int i = 0;
        for (String word : words) {
            if (map.containsKey(word)) {
                if (map.get(word) != pattern.charAt(i)) {
                    return false;
                }
            } else if (map.containsValue(pattern.charAt(i))) {
                return false;
            } else {
                map.put(word, pattern.charAt(i));
            }
            i++;
        }
        return true;

    }
}