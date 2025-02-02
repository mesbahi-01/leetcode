package org.example.finalString;

class Solution {
    public String finalString(String s) {
        StringBuilder result = new StringBuilder(s.length());

        for (char c :
                s.toCharArray()) {
            if (c == 'i') {
                result = result.reverse();
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }
}