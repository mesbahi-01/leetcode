package org.example.removeDigit;

class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        s.removeDigit("1231",'1');
    }
    public String removeDigit(String number, char digit) {
        Integer indexOfFirstOccurrence = null;
        Integer indexOfLastOccurrence = null;

        // find first occurrence of digit in number
        for (int i = 0; i < number.length(); i++) {
            if (digit == number.charAt(i)) {
                indexOfFirstOccurrence = i;
                break;
            }
        }

        // find last occurrence of digit in number
        for (int i = number.length() - 1; i >= 0; i--) {
            if (digit == number.charAt(i)) {
                indexOfLastOccurrence = i;
                break;
            }
        }

        if (indexOfLastOccurrence != null && indexOfFirstOccurrence != null) {
            // "1231"
            if (indexOfFirstOccurrence + 1 < number.length() &&
                    number.charAt(indexOfFirstOccurrence + 1) > number.charAt(indexOfLastOccurrence)) {
                return removeChar(number, indexOfFirstOccurrence);
            } else {
                return removeChar(number, indexOfLastOccurrence);
            }
        } else if (indexOfFirstOccurrence != null) {
            return removeChar(number, indexOfFirstOccurrence);
        } else if (indexOfLastOccurrence != null) {
            return removeChar(number, indexOfLastOccurrence);
        } else return number;
    }

    private static String removeChar(String number, int index) {
        return number.substring(0, index) + number.substring(index + 1);
    }
    // "1231"
}