package org.example.maxScore;

class Solution {
    public int maxScore(String s) {
        char[] arr = s.toCharArray();
        int zeros = arr[0] == '0' ? 1 : 0;
        int ones = 0;

        int maxOfZeros = zeros;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == '0') {
                zeros++;
            } else {
                ones++;
                zeros--;
            }
            maxOfZeros = Math.max(maxOfZeros, zeros);
        }
        ones += arr[arr.length - 1] - '0';

        return maxOfZeros + ones;
    }
}