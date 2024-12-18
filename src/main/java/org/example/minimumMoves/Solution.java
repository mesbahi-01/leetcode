package org.example.minimumMoves;

class Solution {
    public int minimumMoves(String s) {
        int minimum_numberOfMoves = 0;
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == 'X'){
                minimum_numberOfMoves++;
                i = i + 3;
            }else i++;
        }
        return minimum_numberOfMoves;
    }



    private boolean needsAtLeastOneFlip(StringBuilder subString) {
        return subString.indexOf("X") != -1;
    }
}