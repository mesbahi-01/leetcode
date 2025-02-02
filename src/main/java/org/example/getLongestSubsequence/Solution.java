package org.example.getLongestSubsequence;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>(words.length);

        int cur = groups[0];
        result.add(words[0]);
        for (int i = 1; i < groups.length; i++) {

            if (cur == groups[i]) {
                result.add(words[i]);
                cur ^= 1;
            }
        }
        return result;
    }
}