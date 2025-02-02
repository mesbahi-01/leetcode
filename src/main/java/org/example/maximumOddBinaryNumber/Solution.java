package org.example.maximumOddBinaryNumber;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int onesCounter = 0;
        int zerosCounter = 0;

        for (char c :
                s.toCharArray()) {
            if (c == '0') zerosCounter++;
            else onesCounter++;
        }

        int start = 0;

        char[] result = new char[s.length()];

        while (onesCounter > 1) {
            result[start] = '1';
            onesCounter--;
            start++;
        }

        while (zerosCounter > 0) {
            result[start] = '0';
            zerosCounter--;
            start++;
        }

        if (onesCounter > 0) {
            result[start] = '1';
        }

        return new String(result);

    }
}