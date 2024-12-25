package org.example.checkDistances;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkDistances(String s, int[] distance) {
        // foreach char of s
            // if i already saw it
                // calculate distance and see if it respects the condition
                // if not return false;
            // add it a map<char,index>
        // return true

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)){
                if (i - map.get(currentChar) - 1 != distance[currentChar - 'a']){
                    return false;
                }
            }

            map.put(currentChar,i);
        }

        return true;
    }
}