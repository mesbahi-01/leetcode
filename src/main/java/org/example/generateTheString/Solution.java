package org.example.generateTheString;

class Solution {
    public String generateTheString(int n) {
        char[] result = new char[n];
        for (int i = 0; i < n - 1; i++) {
            result[i] = 'a';
        }
        if (n % 2 == 0) result[n - 1] = 'b';
        else result[n - 1] = 'a';
        return new String(result);
    }
}