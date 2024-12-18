package org.example.numOfStrings;

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;

        for (String pattern :
                patterns) {
            if (isSubString(pattern, word)) counter++;
        }

        return counter;
    }

    boolean isSubString(String subString, String s) {

        if (subString.length() > s.length()) return false;
        if (subString.length() == 0) return true;

        for (int i = 0, j = 0; i < s.length(); i++) {
            int k = i;

            while (j < subString.length() && k < s.length() && subString.charAt(j) == s.charAt(k)) {
                j++;
                k++;
            }
            if (j == subString.length()) return true;
            else j = 0;

        }
        return false;
    }
}