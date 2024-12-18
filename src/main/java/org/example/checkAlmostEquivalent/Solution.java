package org.example.checkAlmostEquivalent;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] chars_frequency= new int[128];

        for (int i = 0; i < word1.length(); i++) {
            chars_frequency[word1.charAt(i)]++;
            chars_frequency[word2.charAt(i)]--;
        }

        for (int frequency :
                chars_frequency) {
            if (Math.abs(frequency) > 3) return false;
        }
        return true;

    }
}