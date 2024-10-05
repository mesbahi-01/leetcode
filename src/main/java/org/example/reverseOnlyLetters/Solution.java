package org.example.reverseOnlyLetters;

import java.util.Arrays;

public class Solution {
    public String reverseOnlyLetters(String s) {
        // use two pointers
        // while pointerOne is not a character keep moving
        // while pointerTwo is not a character keep moving
        // swap pointerOne and pointerTwo
        int pointerOne = 0;
        int pointerTwo = s.length() - 1;
        char[] arrayOfChars = s.toCharArray();
        while (pointerOne < pointerTwo ) {

            while (pointerOne < pointerTwo && !isChar(arrayOfChars[pointerOne])) pointerOne++;
            while (pointerTwo > pointerOne && !isChar(arrayOfChars[pointerTwo])) pointerTwo--;

            if (pointerOne < pointerTwo ) {
                char temp = arrayOfChars[pointerOne];
                arrayOfChars[pointerOne] = arrayOfChars[pointerTwo];
                arrayOfChars[pointerTwo] = temp;
                pointerTwo--;
                pointerOne++;
            }
        }
        return new String(arrayOfChars);
    }

    public boolean isChar(char c) {
        return c <= 'z' && c >= 'a' || c <= 'Z' && c >= 'A';
    }
}