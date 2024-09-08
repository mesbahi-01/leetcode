package org.example.lengthOfLongestSubstring;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // declare a variable called maxLength
        // declare a queue
        // for each s[i]
            // if queue does  have s[i]
                // remove from the head of the queue until it does not have s[i]
            // add s[i] to the queue
            // maxLength = max(maxLength, queue.size())
        // return maxLength
        int maxLength = 0;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (queue.contains(s.charAt(i))) {
                while (!queue.isEmpty() && queue.poll() != s.charAt(i)) ;
            }
            queue.add(s.charAt(i));
            maxLength = Math.max(queue.size(), maxLength);
        }
        return maxLength;

    }
}