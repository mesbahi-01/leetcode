package org.example.isAnagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        // if s.size != t.size return false
        // start with an array called counter with a size equals to amount of characters -26-
        // for each s[i] increment counter[s[i] - 'a'] and decrement counter[t[i] - 'a']
        // for each counter[j]
        // if counter[j] different then zero return false
        // return true

        if (s.length() != t.length()) return false;
        int[] counter = new int[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (++counter[s.charAt(i) - 'a'] == 1) count++;
            if (--counter[t.charAt(i) - 'a'] == 0) count--;
        }
        return count == 0;
    }
}