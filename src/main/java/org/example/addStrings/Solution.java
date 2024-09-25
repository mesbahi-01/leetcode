package org.example.addStrings;

public class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;
        char[] num1_arr = num1.toCharArray();
        char[] num2_arr = num2.toCharArray();
        int carry = 0;
        char[] result = new char[Math.max(num1.length(), num2.length()) + 1];
        int k = result.length - 1;
        int l = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += num1_arr[i--] - '0';
            if (j >= 0) sum += num2_arr[j--] - '0';
            carry = sum / 10;
            result[k--] = (char) (sum % 10 + '0');
            l++;
        }
        if (carry != 0) {
            result[k] = (char) (carry + '0');
            l++;
        };
        return new String(result, result.length - l, l);
    }
}