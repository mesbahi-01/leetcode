package org.example.findTheLongestBalancedSubstring;

class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int longestBalancedSubstring = 0;

        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < s.length(); ) {
            // 01000111
            while (i < s.length() && s.charAt(i) == '0') {
                zeros++;
                i++;
            }

            while (i < s.length() && s.charAt(i) == '1') {
                ones++;
                i++;
            }

            longestBalancedSubstring = Math.max(longestBalancedSubstring,
                    Math.min(zeros, ones) * 2);

            zeros = ones = 0;
        }
        return longestBalancedSubstring;
    }
}