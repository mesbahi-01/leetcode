package org.example.truncateSentence;

class Solution {
    public String truncateSentence(String s, int k) {
        // loop through the string s
        // if the character at index i is ' ' decrement k by 1
        // if k equals 0 return the substring of s from 0 to i-1
        // return s
        // the idea is to find the kth space in the string s
        // and return the substring from 0 to the index of the kth space
        // if k is greater than 0 return the whole string s
        // because there are less than k words in the string s

        int i = 0;
        for(; i <s.length() && k > 0;i++) {
            if(s.charAt(i) == ' ') k--;
        }
        return k == 0  ? s.substring(0, i-1) : s;
    }
}