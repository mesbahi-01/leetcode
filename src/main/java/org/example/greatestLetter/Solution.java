package org.example.greatestLetter;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args){
        new Solution().greatestLetter("lEeTcOdE");
    }
    public String greatestLetter(String s) {
        int[] f = calculateFrequency(s);

        int distanceBetweenUpperAndLowercase = 'Z' - 'z';
        for (char c = 'Z'; c >= 'A'; c--) {
            if (f[c] != 0 && f[c - distanceBetweenUpperAndLowercase ] != 0) return c + "";
        }
        return "";
    }

    private int[] calculateFrequency(String s) {
        int[] f = new int[128];
        for (char c :
                s.toCharArray()) {
            f[c]++;
        }
        return f;
    }

}