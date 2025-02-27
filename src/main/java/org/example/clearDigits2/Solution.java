package org.example.clearDigits2;

class Solution {
    public String clearDigits(String s) {
        char[] clearDigits = s.toCharArray();
        int i = 0;
        for (int j = 0; j < clearDigits.length; j++) {
            if (clearDigits[j] <= '9' && clearDigits[j] >= '0') {
                i = Math.max(i - 1, 0);
            } else {
                clearDigits[i++] = clearDigits[j];
            }

        }
        return new String(clearDigits, 0, i);
    }
}