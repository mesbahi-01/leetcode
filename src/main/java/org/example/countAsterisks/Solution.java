package org.example.countAsterisks;

class Solution {
    public int countAsterisks(String s) {
        int total = 0;
        int pairs = 0;
        for (char c: s.toCharArray()){
            if (pairs% 2 == 0 && c == '*') total++;
            if (c == '|') pairs++;
        }
        return total;

    }
}