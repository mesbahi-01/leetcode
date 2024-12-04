package org.example.checkZeroOnes;

class Solution {
    public boolean checkZeroOnes(String s) {
        int maximumNumberOfContiguousOnes = 0;
        int maximumNumberOfContiguousZeros = 0;

        int counter = 0;
        for (int i = 0; i < s.length();) {// 111000
            counter = 1; // you hit the loop which means you have at least one char
            int j = i + 1; // position yourself in the next index
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                counter++;
                j++;
            } // keep counting contiguous chars

            // updated the appropriate counter
            if (s.charAt(i) == '1') {
                maximumNumberOfContiguousOnes = Math.max(maximumNumberOfContiguousOnes, counter);
            } else if (s.charAt(i) == '0') {
                maximumNumberOfContiguousZeros = Math.max(maximumNumberOfContiguousZeros, counter);
            }
            // position yourself in the begining of the new contiguous sequence
            i = j;

        }

        return maximumNumberOfContiguousOnes > maximumNumberOfContiguousZeros;
    }
}