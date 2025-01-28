package org.example.oddString;

import java.util.Arrays;

class Solution {
    public String oddString(String[] words) {
        // array to store differences
        // foreach word
        //
        int n = words[0].length();
        int[] arrayOfDifferences1 = calculateDifference(words[0]);
        int[] arrayOfDifferences2 = calculateDifference(words[1]);
        int[] arrayOfDifferences3;


        if (!Arrays.equals(arrayOfDifferences1, arrayOfDifferences2)) {
            arrayOfDifferences3 = calculateDifference(words[2]);
            if (Arrays.equals(arrayOfDifferences1, arrayOfDifferences3)) {
                return words[1];
            } else {
                return words[0];
            }
        }

        for (int i = 2; i < words.length; i++) {
            if (!Arrays.equals(calculateDifference(words[i]),arrayOfDifferences2)) return words[i];
        }

        return null;
    }

    private int[] calculateDifference(String word) {
        int[] arrayOfDifferences = new int[word.length() - 1];
        for (int i = 0; i < word.length() - 1; i++) {
            arrayOfDifferences[i] = word.charAt(i + 1) - word.charAt(i);
        }
        return arrayOfDifferences;
    }
}