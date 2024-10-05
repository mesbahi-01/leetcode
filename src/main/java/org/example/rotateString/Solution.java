package org.example.rotateString;

class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            boolean goalIsRotatedStringOfS = true;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != goal.charAt((j + i) % s.length())) {
                    goalIsRotatedStringOfS = false;
                    break;
                }
            }
            if (goalIsRotatedStringOfS) return true;
        }
        return false;
    }
}