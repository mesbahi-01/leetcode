package org.example.isPalindrome;


class Solution {
    public boolean isPalindrome(String s) {
        // use toAlphanumeric method to get a string of alphanumeric characters
        // use left_pointer and right_pointer to creat a window
        // while (left_pointer < right_pointer)
            // if s[left_pointer] != s[right_pointer] return false
        // return true
        char left_char, right_char;
        int left_pointer = 0, right_pointer = s.length() - 1;
        while (left_pointer < right_pointer) {
            left_char = s.charAt(left_pointer);
            right_char = s.charAt(right_pointer);
            if (!isAlphanumeric(left_char)) {
                left_pointer++;
                continue;
            }
            if (!isAlphanumeric(right_char)) {
                right_pointer--;
                continue;
            }
            if (Character.toLowerCase(left_char) != Character.toLowerCase(right_char)) {
                return false;
            }
            left_pointer++;
            right_pointer--;
        }
        return true;
    }

/*
    private String toAlphanumeric(String s) {
        StringBuffer newS = new StringBuffer(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (isAlphanumeric(s.charAt(i)))
                newS.append(
                        Character.toLowerCase(s.charAt(i))
                );
        }
        return newS.toString();
    }
*/

    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}