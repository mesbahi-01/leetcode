package org.example.validPalindrome;

public class Solution {
    public boolean validPalindrome(String s) {

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (right - left == 1) return true;
                return isPalindrome(s.substring(left, right)) ||
                        isPalindrome(s.substring(left + 1, right + 1));

            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String substring) {
        int left = 0, right = substring.length() - 1;
        while (left < right) {
            if (substring.charAt(left) != substring.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}// 0  1  2  3  4  5  6  7  8  9
//  e  b  c  b  b  e  c  e  c  a
//  e  b  c  b  b  c  e  c  a  b  b
//  10 11 12 13 14 15 16 17 18 19 20

// <e> c e c a b b a c e <c> the correct step is skipping e
// <e> c e c a b b a c e <c> ok
