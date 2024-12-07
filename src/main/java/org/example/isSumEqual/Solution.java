package org.example.isSumEqual;

class Solution {
    public static void main(String[] args){
        new Solution().isSumEqual("acb","cba","cdb");
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstWord_numeric_value = calculateNumericalValue(firstWord);
        int second_numeric_value = calculateNumericalValue(secondWord);
        int target_numeric_value = calculateNumericalValue(targetWord);
        return firstWord_numeric_value + second_numeric_value == target_numeric_value;
    }

    private int calculateNumericalValue(String firstWord) {
        int result = 0;
        int power = firstWord.length() - 1;

        for (int i = 0; i < firstWord.length(); i++) {
            result+= (firstWord.charAt(i) - 'a') * Math.pow(10,power--);
        }
        return result;
    }
}