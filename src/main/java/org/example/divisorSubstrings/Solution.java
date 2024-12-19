package org.example.divisorSubstrings;

class Solution {
    public int divisorSubstrings(int num, int k) {
        int numberOfDivisorSubstrings = 0;
        String nums_as_string = Integer.toString(num);
        for (int i = 0; nums_as_string.length() - i >= k; i++) {
            int divider = Integer.parseInt(nums_as_string.substring(i,i+k));
            if (divider != 0 && num % divider  == 0)
                numberOfDivisorSubstrings++;
        }
        return numberOfDivisorSubstrings;
    }
}