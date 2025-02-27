package org.example.maximumLengthSubstring;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

class Solution {
    public int maximumLengthSubstring(String s) {
        // bcbbbcba
        int maximumLength = Integer.MIN_VALUE;

        int[] frequency = new int[128];
        Queue<Character> queue = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (frequency[c] > 2) {
                while (true) {
                    Character polledChar = queue.poll();
                    if (polledChar == null) break;
                    frequency[polledChar]--;
                    if (polledChar == c) break;
                }

            }

            queue.add(c);
            frequency[c]++;
            maximumLength = Math.max(maximumLength, queue.size());
        }
        return maximumLength;
    }
}