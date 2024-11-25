package org.example.maxDepth;

class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int counter = 0;
        for (char c :
                s.toCharArray()) {
            if (c == '(') {
                counter++;
            } else if(c == ')') {
                maxDepth = Math.max(counter, maxDepth);
                counter--;
            }
            maxDepth = Math.max(counter, maxDepth);
        }
        return maxDepth;
    }
}