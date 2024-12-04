package org.example.countConsistentStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // create a hash set from allowed characters
        // foreach word of words
        // foreach char of word
        // if it does not exist in the hash set go to next word
        // all chars are legit increment counter by one

        // return counter
        int counter = 0;
        boolean[] allowed_chars_set = new boolean[128];

        for (int i = 0; i < allowed.length(); i++) {
            allowed_chars_set[allowed.charAt(i)] = true;
        }
        boolean flag;

        for (Character c :
                allowed.toCharArray()) {
            flag = true;
            for (String word :
                    words) {
                for (int u = 0; u < word.length(); u++) {
                    if (!allowed_chars_set[word.charAt(u)]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) counter++;
            }
        }
        return counter;
    }
}