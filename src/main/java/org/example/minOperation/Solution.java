package org.example.minOperation;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minOperations("10010100"));
    }
    public int minOperations(String s) {
        char[] array1 = new char[s.length()];
        array1[0] = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            array1[i] = revers(array1[i - 1]);
        }
        char[] array2 = new char[s.length()];
        array2[0] = revers(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            array2[i] = revers(array2[i - 1]);
        }
        return Math.min(compereDifference(s.toCharArray(),array1),compereDifference(s.toCharArray(),array2));
    }

    private int compereDifference(char[] charArray, char[] array1) {
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != array1[i]) {
                count++;
            }
        }
        return count;
    }

    private char revers(char current) {
        if (current == '1') {
            return '0';
        } else return '1';
    }
}