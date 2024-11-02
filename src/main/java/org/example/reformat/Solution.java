package org.example.reformat;

import java.util.LinkedList;
import java.util.Queue;


public class Solution {
    public String reformat(String s) {


        int totalFrequencyOfDigits = 0;
        int totalFrequencyOfCharacters = 0;

        int halfLengthOfS = s.length() / 2;
        Queue<Character> characterQueue = new LinkedList<>();
        Queue<Character> digitsQueue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                digitsQueue.add(s.charAt(i));
                totalFrequencyOfDigits++;
            } else {
                characterQueue.add(s.charAt(i));
                totalFrequencyOfCharacters++;
            }

        }

        if (Math.abs(totalFrequencyOfCharacters - totalFrequencyOfDigits) > 1) return "";

        StringBuilder result = new StringBuilder();

        boolean charGoesFirst;
        if (isEven(totalFrequencyOfCharacters) && !isEven(totalFrequencyOfDigits)) charGoesFirst = true;
        else charGoesFirst = false;
        // covid2019
        // 5c - 4d
        // c2o0v1i9d

        // 619mama
        // 3c - 4d
        // m6a1m9a
        Character temp;
        for (int i = 0; i < s.length(); i++) {
            if (isEven(i)) {
                if (!isEven(totalFrequencyOfDigits)) {
                    temp = characterQueue.poll();
                    result.append(temp != null ? temp : "");
                    temp = digitsQueue.poll();
                } else {
                    temp = digitsQueue.poll();
                    result.append(temp != null ? temp : "");
                    temp = characterQueue.poll();
                }
            } else {
                if (isEven(totalFrequencyOfDigits)) {
                    temp = digitsQueue.poll();
                    result.append(temp != null ? temp : "");
                    temp = characterQueue.poll();
                } else {
                    temp = characterQueue.poll();
                    result.append(temp != null ? temp : "");
                    temp = digitsQueue.poll();
                }
            }
            result.append(temp != null ? temp : "");
        }
        return result.toString();
    }

    boolean isEven(int n) {
        return (1 & n) != 1;
    }
}