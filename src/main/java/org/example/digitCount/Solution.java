package org.example.digitCount;

class Solution {
    public boolean digitCount(String num) {
        int[] packet = new int[10];
        for (int i = 0, charArrayLength = num.length(); i < charArrayLength; i++) {
            if (++packet[num.charAt(i) - 'a'] != i) return false;
        }
        return true;

    }


}