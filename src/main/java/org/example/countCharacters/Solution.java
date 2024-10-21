package org.example.countCharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countCharacters(String[] words, String chars) {
        // create a map for <chars> and calculate the frequency of each character
        // set result to 0;
        // foreach word of words
            // calculate frequency of chars in that word
            // if one frequency of that word is greater then frequency of chars_map
            // go to next word
            // if not then increment result
        // return result
        Map<Character,Integer> chars_map = new HashMap<>();
        for (char c :
                chars.toCharArray()) {
            chars_map.put(c, chars_map.getOrDefault(c, 0) + 1);
        }

        int[] frequency = new int[128];
        boolean isGood;
        int result = 0;
        for (String word :
                words) {
            isGood = true;
            for (char c :
                    word.toCharArray()) {
                frequency[c]++;
                if (chars_map.get(c) == null || frequency[c] > chars_map.get(c)){
                    isGood = false;
                    break;
                }
            }
            if (isGood) result+=word.length();

            Arrays.fill(frequency, 0);
        }
        return result;
    }
}