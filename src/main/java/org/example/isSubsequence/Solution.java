package org.example.isSubsequence;

class Solution {
    public boolean isSubsequence(String s, String t) {
        // start with two counters i and j
        // foreach character of t
            // if that character is equal to s[i] increment i
            // if i equals to the length of s return true
        // return false since you did not find the sequence s
        char[] s_as_chars = s.toCharArray();
        char[] t_as_chars = t.toCharArray();
        if (s_as_chars.length == 0) return true;
        for (int i = 0,j = 0 ; j < t_as_chars.length; j++) {
            if (t_as_chars[j] == s_as_chars[i]) i++;
            if (i == s_as_chars.length) return true;
        }
        return false;
    }
}