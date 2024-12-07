package org.example.makeEqual;

class Solution {
    public boolean makeEqual(String[] words) {
        // calculate frequency of chars in all words
        // if frequency is not divisible by length of words return false

        int[] frequency = new int[128];

        for (String word :
                words) {
            for (char c :
                    word.toCharArray()) {
                frequency[c]++;
            }
        }

        for (int frequency_of_char_x :
                frequency) {
            if (frequency_of_char_x % words.length != 0) return false;
        }
        return true;
    }
}