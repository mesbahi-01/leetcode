package org.example.isIsomorphic;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        // check if the length of the two strings are the same
        // if not, return false
        // create a map to store the mapping of characters from s to t
        // iterate through the characters of s and t
        // if the character from s is already in the map
        // check if the mapping is the same as the character from t
        // if not, return false
        // if the character from s is not in the map
        // check if the character from t is already in the map
        // if yes, return false
        // add the mapping of the character from s to t to the map
        // return true
        // why is this solution correct?
        // the solution is correct because it checks if the characters from s and t can be mapped to each other
        // without any conflicts
        // if there are conflicts, the solution returns false
        // if there are no conflicts, the solution returns true
        // the solution has a time complexity of O(n) where n is the length of the strings s and t
        // the solution has a space complexity of O(n) where n is the length of the strings s and t
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (map.containsValue(c2)) return false;
                map.put(c1, c2);
            }
        }
        return true;
    }
}