package org.example.reverseVowels;

import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        // start with a set of vowels
        // create an array of chars from s
        // declare two counters ,left and right
        // initials left with zero and right with s.length - 1
        // while(left < right)
            // if chars[left] is not a vowel increment left and continue
            // if chars[right] is not a vowel decrement right and continue
            // swap chars[left] and chars[right] and increment left and decrement right
        // return the string representation of the array

        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        while (left < right) {
            if (!vowels.contains(chars[left])) {
                left++;
                continue;
            }
            if (!vowels.contains(chars[right])) {
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}