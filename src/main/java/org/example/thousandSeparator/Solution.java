package org.example.thousandSeparator;

class Solution {
    public String thousandSeparator(int n) {

        StringBuilder result = new StringBuilder(String.valueOf(n));

        for (int i = result.length() - 3; i > 0; i-=3) {
            result.insert(i,'.');
        }

        return result.toString();

    }
}