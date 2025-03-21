package org.example.multiply;

class Solution {
    public static void main(String[] args) {
        String multiply = new Solution().multiply("0", "456");
        System.out.println("multiply = " + multiply);
    }

    public String multiply(String num1, String num2) {
        //   14
        // *
        //   13
        //---------
        //  42  (1)
        // 14.
        // -------
        // 182
        StringBuilder res = new StringBuilder();
        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }


        int rest = 0;
        StringBuilder multiplicationResult;
        for (int i = num1.length() - 1, power = 0; i >= 0; i--, power++) {
            int digit1 = num1.charAt(i) - '0';

            multiplicationResult = new StringBuilder();
            multiplicationResult.append("0".repeat(Math.max(0, power)));

            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int multiplication = digit1 * digit2 + rest;
                multiplicationResult.append(multiplication % 10);
                rest = multiplication / 10;
            }

            if (rest > 0) {
                multiplicationResult.append(rest);
                rest = 0;
            }

            res = sum(res, multiplicationResult.reverse());

        }

        // multiply each digit of num1 with num2
        // and at the same time construct the partial result


        return removeLeadingZeros(res.toString());
    }

    private StringBuilder sum(StringBuilder num1, StringBuilder num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int rest = 0;
        int digit1;
        int digit2;

        while (i >= 0 || j >= 0) {

            digit1 = 0;
            digit2 = 0;

            if (i >= 0) {
                digit1 = num1.charAt(i) - '0';
            }
            if (j >= 0) {
                digit2 = num2.charAt(j) - '0';
            }

            int sum = digit1 + digit2 + rest;

            result.append(sum % 10);
            rest = sum / 10;

            i--;
            j--;
        }
        if (rest > 0) {
            result.append(rest);
        }

        return result.reverse();
    }

    private String removeLeadingZeros(String s) {

        int index = -1;
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
            index++;
        }
        if (index == s.length() - 1) return "0";
        if (index == -1) return s;
        return s.substring(index + 1);
    }
}