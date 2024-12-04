package org.example.mergeAlternately;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        // start with an empty char array its length equals word1.length + word2.length
        // initialize two pointers p1 and p2 and p
        // while p1 < word1.length && p2 < word2.length
            // result[p] = word1[p1]
            // increment p
            // result[p] = word2[p2]
            // increment p1 and p2
        // while p1 < word1.length
        //            // result[p] = word1[p1]
        //            // increment p
        //            // increment p1
        // while p2 < word2.length
        //            // result[p] = word2[p2]
        //            // increment p
        //            // increment p2
        // concatenate chars of the result and return it
        char[] result = new char[word1.length() + word2.length()];
        int p= 0;
        for (int i = 0; i < word1.length(); i++) {
            result[p] = word1.charAt(i);
            p +=2;
        }// a  b  c
         //   d  e
        p=1;
        for (int i = 0; i < word2.length(); i++) {
            result[p] = word2.charAt(i);
            p +=2;
        }
        return new String(result,0,p - 2);
    }
}