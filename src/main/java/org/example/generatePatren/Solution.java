package org.example.generatePatren;

public class Solution {
    public String generatePattern(int length) {
        if (length == 0) return "";
        char[] result = new char[length];
        int numberOfLeftParenthesis = 0;
        int numberOfRightParenthesis = 0;
        int i = -1;
//  ( )
        int randomPosition;
        char[] parenthesis = new char[]{'(', ')'};
        for ( ; i < length - 1 ; ) {
            result[++i] = '(';
            numberOfLeftParenthesis++;
            if (numberOfLeftParenthesis >= length / 2) break;
            randomPosition = (int) ((Math.random() * 10) % 2);
            if (parenthesis[randomPosition] == '(') {
                numberOfLeftParenthesis++;
                result[++i] = '(';
            } else {
                while(numberOfLeftParenthesis > numberOfRightParenthesis && i < length -1){
                    result[++i] = ')';
                    numberOfRightParenthesis++;
                }
            }
        }
        while(numberOfLeftParenthesis > numberOfRightParenthesis && i < length -1){
            result[++i] = ')';
            numberOfRightParenthesis++;
        }
        return new String(result);
    }
}
