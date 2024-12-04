package org.example.replaceDigits;

class Solution {
    public String replaceDigits(String s) {
        StringBuilder formattedString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (isEven(i)){
                formattedString.append(s.charAt(i));
            }else {
                formattedString.append(
                        shift(s.charAt(i-1),
                                s.charAt(i) - '0')
                );
            }
        }
        return formattedString.toString();
    }

    private char shift(char c, int i) {
        return (char) (c + i);
    }

    private boolean isEven(int i) {
        return i % 2 == 0;
    }
}