package org.example.countPrefixes;

class Solution {
    public int countPrefixes(String[] words, String s) {
        int counter = 0;
        for (String word :
                words) {
            if (s.startsWith(word)) counter++;
        }
        return counter;
    }

    private boolean isPrefix(String word, String s) {
        if (word.length() > s.length()) return false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != s.charAt(i)) return false;
        }
        return true;
    }
}