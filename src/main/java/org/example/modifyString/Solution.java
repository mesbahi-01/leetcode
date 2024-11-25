package org.example.modifyString;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public String modifyString(String s) {
        char[] result = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            Character nextChar = null;
            Character prevChar = null;


            if (result[i] == '?') {
                if (i + 1 < s.length())
                    nextChar = result[i + 1];
                if (i - 1 >= 0)
                    prevChar = result[i - 1];
                result[i] = charDifferentThen(prevChar, nextChar);
            }
        }
        return new String(result);
    }

    private char charDifferentThen(Character ...chars) {
        char c = 'a';
        List<Character> list = Arrays.asList(chars);
        while (list.contains(c)) {
            c = nextCharAfter(c);
        }
        return c;
    }

    private char nextCharAfter(Character c) {
        if (c == 'z') return 'a';
        return (char) (c + 1);

    }
}