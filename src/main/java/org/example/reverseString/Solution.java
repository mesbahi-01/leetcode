package org.example.reverseString;

class Solution {
    public void reverseString(char[] s) {
        // start with two indexes left and right;
        // initialize left with 0 and right with s.length - 1
        // declare a variable temp to hold a character
        // while left < right
            // temp = s[right]
            // s[right] = s[left]
            // s[left] = temp
            // left++ and right--
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
}