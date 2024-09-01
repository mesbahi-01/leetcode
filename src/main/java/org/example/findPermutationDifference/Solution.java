package org.example.findPermutationDifference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int findPermutationDifference(String s, String t) {
        // declare a variable called sum to hold the totale permutation Difference
        // declare an array called arrayOfChars with a size equals to 26
        // initialize all its elements with 0
        // loop trough s and do the following :
            // arrayOfChars['a' - s.charAt(i)] += i
            // arrayOfChars['a' - t.charAt(i)] -= i
        // return the sum of the absolute values of the elements of arrayOfChars
        int sum = 0;
        int[] arrayOfChars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arrayOfChars[s.charAt(i) - 'a'] += i;
            arrayOfChars[t.charAt(i) - 'a'] -= i;
        }
        for (int v : arrayOfChars) {
            sum += Math.abs(v);
        }
        return sum;
    }
}