package org.example.maxScore;

class Solution {
    public int maxScore(String s) {
        int maximumScore = 0;
        char[] arr = s.toCharArray();
        int zeros = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0') zeros++;
        } // 00 01
        int i = arr.length - 1;
        int ones = arr[i] - '0';

        while (true) {
            maximumScore = Math.max(ones + zeros, maximumScore);
            i--;
            if (arr[i] == '1') {
                ones++;
            } else {
                zeros = Math.max(--zeros, 0);
            }
            if (i == 0) break;
        }
        return maximumScore;

    }
}