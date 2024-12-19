package org.example.removeAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; ) {
            int j = i + 1;
            while (j < words.length && isAnagram(words[i], words[j])) j++;
            result.add(words[i]);
            i = j;
        }
        return result;
    }

    private boolean isAnagram(String s, String s1) {
        if (s.length() != s1.length()) return false;
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[s1.charAt(i) - 'a']--;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) return false;
        }
        return true;
    }
}