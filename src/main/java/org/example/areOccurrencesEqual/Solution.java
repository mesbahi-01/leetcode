package org.example.areOccurrencesEqual;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] frequency = new int[128];

        for (char c :
                s.toCharArray()) {
                frequency[c]++;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (frequency[s.charAt(i)] != frequency[s.charAt(i + 1)]) return false;
        }


        return true;
    }
}