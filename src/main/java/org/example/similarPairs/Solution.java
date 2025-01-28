package org.example.similarPairs;

import java.util.Arrays;

class Solution {
    public int similarPairs(String[] words) {
        int similarPairsCounter = 0;
        for (int i = 0; i < words.length; i++) {
            boolean[] available_chars = available_chars_in_string(words[i]);
            for (int j = i; j < words.length; j++) {
                if (Arrays.equals(available_chars,available_chars_in_string(words[j]))){
                    similarPairsCounter++;
                }
            }
        }
        return similarPairsCounter;
    }

    private boolean[] available_chars_in_string(String word) {
        boolean[] arr = new boolean[26];
        for (char c :
                word.toCharArray()) {
            arr[c - 'a'] = true;
        }
        return arr;
    }
}