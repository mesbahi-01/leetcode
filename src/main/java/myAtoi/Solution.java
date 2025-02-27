package myAtoi;

class Solution {
    public static void main(String[] args) {
        new Solution().myAtoi("-91283472332");
    }

    public int myAtoi(String s) {

        int result = 0;

        // Ignore any leading whitespace (" ")
        int k = 0;
        while (k < s.length() && s.charAt(k) == ' ') {
            k++;
        }

        // Determine the sign by checking if the next character is '-' or '+'
        int signedness = 1;
        if (k < s.length() && s.charAt(k) == '-') {
            signedness = -1;
            k++;
        }

        // skipping leading zeros
        while (k < s.length() && s.charAt(k) == '0') {
            k++;
        }

        for (; k < s.length(); k++) {
            if (s.charAt(k) <= '9' && s.charAt(k) >= '0') {
                if ((result * 10 + s.charAt(k) - '0') < Integer.MAX_VALUE && (result * 10 + s.charAt(k) - '0') > Integer.MIN_VALUE)
                    result = result * 10 + s.charAt(k) - '0';
                else {
                    result = signedness == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }

        result *= signedness;

        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return result;


    }

}