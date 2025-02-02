package org.example.removeTrailingZeros;

class Solution {
    public String removeTrailingZeros(String num) {

        int indexOfLastDigitNotAZero = num.length() - 1;

        while (indexOfLastDigitNotAZero > 0
                && num.charAt(indexOfLastDigitNotAZero) == '0')
            indexOfLastDigitNotAZero--;

        return num.substring(0,indexOfLastDigitNotAZero + 1);
    }
}