package org.example.largestOddNumber;


class Solution {
    public String largestOddNumber(String num) {
        // "35427"
        System.gc();
        // extract subString that has as its last character an odd number
        for (int i = num.length() - 1; i >= 0; i++) {
            if (isOdd(num.charAt(i) - '0')){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public boolean isOdd(int n) {
        return (n & 1) == 1;
    }

}