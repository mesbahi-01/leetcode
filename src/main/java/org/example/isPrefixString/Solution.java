package org.example.isPrefixString;

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int index_s = 0;
        for (String word :
                words) {
            for (int i = 0; i < word.length(); i++) {

                if (index_s == s.length()) return true; // found all chars in s

                if (s.charAt(index_s) == word.charAt(i) // a char from s is missing
                        && remainingChar(s,index_s)  // found all chars of s but word has more than necessary
                        >= remainingChar(word,i) )
                    index_s++;
                else return false;
            }
        }
        return index_s == s.length();
    }

    private int remainingChar(String s, int index) {
        return s.length() - index;
    }
}