package org.example.areNumbersAscending;

class Solution {
    public boolean areNumbersAscending(String s) {

        StringBuilder number = new StringBuilder(2);
        int previousViewedNumber = Integer.MIN_VALUE;

        char[] charArray = s.toCharArray();
        for (int i = 0, charArrayLength = charArray.length; i < charArrayLength; ) {

            while (i < charArrayLength && (charArray[i] <= '9' && charArray[i] >= '0')) {
                number.append(charArray[i]);
                i++;
            }

            if (!number.isEmpty()) {
                int parsedInteger = Integer.parseInt(number.toString());
                if (parsedInteger <= previousViewedNumber) {
                    return false;
                } else {
                    previousViewedNumber = parsedInteger;
                    number = new StringBuilder();
                }
            } else {
                i++;
            }
        }

        return true;
    }
}