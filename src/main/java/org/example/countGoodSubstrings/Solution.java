package org.example.countGoodSubstrings;

class Solution {
    public int countGoodSubstrings(String s) {

        int counter = 0;
        for (int i = 0; i < s.length() - 2; i = i + 1) {
            if (s.charAt(i) != s.charAt(i + 1)
                    && s.charAt(i + 1) != s.charAt(i + 2)
                    && s.charAt(i) != s.charAt(i + 2))
                counter++;
        }// a b a
        return counter;
    }

    private boolean consisteOfDistinctChars(String substring) {
        boolean[] seen = new boolean[128];
        for (char c :
                substring.toCharArray()) {
            if (seen[c]) return false;
            else seen[c] = true;
        }
        return true;
    }
}