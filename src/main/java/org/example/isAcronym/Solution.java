package org.example.isAcronym;

import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;

        int i = 0;

        for (String word :
                words) {
            if (s.charAt(i) != word.charAt(0)) return false;
            i++;
        }

        // i did not reach the end of s (we could not find all the required chars)
        return  true;
    }
}