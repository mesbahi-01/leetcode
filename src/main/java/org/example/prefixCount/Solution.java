package org.example.prefixCount;

class Solution {
    public int prefixCount(String[] words, String pref) {
        int counter = 0;
        for (String word :
                words) {
            if (isPrefix(word, pref)) counter++;
        }
        return counter;
    }

    private boolean isPrefix(String word, String pref) {
        if (pref.length() > word.length()) return false;
        for (int i = 0; i < pref.length(); i++) {
            if (word.charAt(i) != pref.charAt(i)) return false;
        }
        return true;
    }
}