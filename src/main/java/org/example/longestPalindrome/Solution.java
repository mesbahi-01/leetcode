package org.example.longestPalindrome;

public class Solution {
    public int longestPalindrome(String s) {
        // the approach is to calculate the frequency of each char
        // then for each char if it's frequency is even we can add it to the result
        // if it's frequency is odd we can add it to the result - 1
        // if the result is even and the frequency is odd we can add 1 to the result

        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        int result = 0;
        boolean hasOddFrequency = false;

        for (int i : freq) {// Check is the frequency is even
            if ((i % 2) == 0) {
                result += i;
            } else {
                // If the frequency is odd, one occurrence of the
                // character will remain without a match
                result += i - 1;
                hasOddFrequency = true;
            }
        }
        // If hasOddFrequency is true, we have at least one unmatched
        // character to make the center of an odd length palindrome.
        if (hasOddFrequency) return result + 1;

        return result;
    }
}