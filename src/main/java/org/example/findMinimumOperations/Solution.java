package org.example.findMinimumOperations;

import java.util.List;

class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        StringBuilder result = new StringBuilder();


        int minLength = findMinLength(s1,s2,s3);

        for (int i = 0; i < minLength;
             i++) {
            if (s1.charAt(i) == s2.charAt(i) && s3.charAt(i) == s2.charAt(i)) {
                result.append(s1.charAt(i));
            } else {
                break;
            }
        }

        if (result.isEmpty()) return -1;
        int numberOfOperations = 0;

        for (String s :
                List.of(s1, s2, s3)) {
            numberOfOperations += s.length() - result.length();
        }

        return numberOfOperations;

    }

    private int findMinLength(String... strings){
        int minLength = Integer.MAX_VALUE;

        for (String s :
                strings) {
            minLength = Math.min(minLength, s.length());
        }
        return minLength;

    }
}