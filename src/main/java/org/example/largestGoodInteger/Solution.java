package org.example.largestGoodInteger;

class Solution {
    public String largestGoodInteger(String num) {
        String largestGoodInteger = "";

        int requiredLength = 3;
        final int end = num.length() - requiredLength;
        for (int i = 0, j; i <= end; ) {
            boolean isValid = true;

            int end2 = i + requiredLength;
            for (j = i; j < end2; j++) {
                if (num.charAt(i) != num.charAt(j)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                if (largestGoodInteger.isEmpty() ||
                        largestGoodInteger.charAt(0) < num.charAt(i)) {
                    largestGoodInteger = num.substring(i, i + requiredLength);
                }
                i += requiredLength;
            } else i++;
        }
        return largestGoodInteger;
    }
}