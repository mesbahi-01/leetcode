package org.example.sortString;

public class Solution {
    public String sortString(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder s_copy = new StringBuilder(s);
        do {
            // 1) Remove the smallest character from s and append it to the result.
            Character smallestChar = findSmallestChar(s_copy);
            result.append(smallestChar);

            Character secondSmallestChar;
            do {
                //2) Remove the smallest character from s that is greater than the last appended character, and append it to the result.
                secondSmallestChar = findSmallestCharGreaterThenX(s_copy, smallestChar);
                if (secondSmallestChar != null) {
                    result.append(secondSmallestChar);
                    smallestChar = secondSmallestChar;
                }
                //3) Repeat step 2 until no more characters can be removed.
            } while (secondSmallestChar != null);

            // 4) Remove the largest character from s and append it to the result.
            Character largestChar = findLargestChar(s_copy);
            if (largestChar != null) {
                result.append(largestChar);
            }

            // 5) Remove the largest character from s that is smaller than the last appended character,
            // and append it to the result.

            Character secondLargestChar;
            do {
                secondLargestChar = findSecondLargestChar(s_copy, largestChar);
                if (secondLargestChar != null) {
                    result.append(secondLargestChar);
                    largestChar = secondLargestChar;
                }
                // 6) Repeat step 5 until no more characters can be removed.
            } while (secondLargestChar != null);

            // 7) Repeat steps 1 through 6 until all characters from s have been removed.


        } while (!s_copy.isEmpty());
        return result.toString();
    }

    private Character findSecondLargestChar(StringBuilder s, Character largestChar_input) {
        if (s.isEmpty() || largestChar_input == null) return null;
        Character secondLargestestChar = null;
        int largestCharIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (largestChar_input != s.charAt(i)) {
                if (secondLargestestChar != null) {
                    if (s.charAt(i) > secondLargestestChar && s.charAt(i) < largestChar_input){
                        secondLargestestChar = s.charAt(i);
                        largestCharIndex = i;
                    }
                } else {
                    if (s.charAt(i) < largestChar_input) {
                        secondLargestestChar = s.charAt(i);
                        largestCharIndex = i;
                    }
                }

            }
        }

        if (secondLargestestChar != null) {
            s.replace(largestCharIndex, largestCharIndex + 1, "");
        }
        return secondLargestestChar;
    }

    private Character findLargestChar(StringBuilder s) {
        if (s.isEmpty()) return null;
        int largestCharIndex = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > s.charAt(largestCharIndex)) largestCharIndex = i;
        }
        Character largestChar = s.charAt(largestCharIndex);
        s.replace(largestCharIndex, largestCharIndex + 1, "");
        return largestChar;
    }

    private Character findSmallestCharGreaterThenX(StringBuilder s, Character smallestChar_input) {
        if (s.isEmpty() || smallestChar_input == null) return null;
        Character secondSmallestChar = null;
        int smallestCharIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (smallestChar_input != s.charAt(i)) {
                if (secondSmallestChar != null) {
                    if (s.charAt(i) < secondSmallestChar && s.charAt(i) > smallestChar_input){
                        secondSmallestChar = s.charAt(i);
                        smallestCharIndex = i;
                    }
                } else {
                    if (s.charAt(i) > smallestChar_input) {
                        secondSmallestChar = s.charAt(i);
                        smallestCharIndex = i;
                    }
                }

            }
        }

        if (secondSmallestChar != null) {
            s.replace(smallestCharIndex, smallestCharIndex + 1, "");
        }
        return secondSmallestChar;
    }

    private Character findSmallestChar(StringBuilder s) {
        if (s.isEmpty()) return null;
        int smallestCharIndex = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(smallestCharIndex)) smallestCharIndex = i;
        }
        char smallestChar = s.charAt(smallestCharIndex);
        s.replace(smallestCharIndex, smallestCharIndex + 1, "");
        return smallestChar;
    }
}