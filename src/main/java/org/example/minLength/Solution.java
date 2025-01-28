package org.example.minLength;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Solution {
    public int minLength(String s) {
        Deque<Character> queue = new ArrayDeque<>();
//  "ACBBD"
        for (int i = 0; i < s.length(); i++) {
            if (queue.isEmpty()) {
                queue.addLast(s.charAt(i));
            } else {
                char currentChar = s.charAt(i);

                if (
                        (queue.getLast() == 'A' && currentChar == 'B') ||
                        (queue.getLast() == 'C' && currentChar == 'D')
                ) {
                    queue.removeLast();
                } else
                    queue.addLast(currentChar);
            }
        }
        return queue.size();
    }
}