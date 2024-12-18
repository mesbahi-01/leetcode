package org.example.firstPalindrome;

class Solution {
    public String firstPalindrome(String[] words) {
        for (String word :
                words) {
            if (isPalindrome(word)) return word;
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        int i = 0;
        int j  = word.length() -1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j) ) return false;
            i++;
            j--;
        }
        return true;
    }
}