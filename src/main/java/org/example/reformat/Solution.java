package org.example.reformat;

public class Solution {
    public String reformat(String s) {

        int[] frequencyOfDigits = new int[10];
        int[] frequencyOfCharacters = new int[26];

        int totalFrequencyOfDigits = 0;
        int totalFrequencyOfCharacters = 0;

        int halfLengthOfS = s.length() / 2;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                frequencyOfDigits[s.charAt(i) - '0']++;
                totalFrequencyOfDigits++;
            } else {
                frequencyOfCharacters[s.charAt(i) - 'a']++;
                totalFrequencyOfCharacters++;
            }

        }

        if (Math.abs(totalFrequencyOfCharacters - totalFrequencyOfDigits) > 1) return "";

        StringBuilder result = new StringBuilder();
        /// i should start with the even number // example x3x3x
        int odd = 0, even = 0;
        int[] arrayToHoldCharsWithOddNumberOfOccurrence;
        int[] arrayToHoldCharsWithEvenNumberOfOccurrence;

        char base_char_for_odd,base_char_for_even;
        int oddFrequencyCounter,evenFrequencyCounter;
        if (totalFrequencyOfCharacters % 2 == 1) {
            arrayToHoldCharsWithOddNumberOfOccurrence = frequencyOfCharacters;
            arrayToHoldCharsWithEvenNumberOfOccurrence = frequencyOfDigits;

            oddFrequencyCounter = totalFrequencyOfCharacters;
            evenFrequencyCounter  = totalFrequencyOfDigits;

            base_char_for_odd = 'a';
            base_char_for_even = '0';

        } else {
            arrayToHoldCharsWithEvenNumberOfOccurrence = frequencyOfCharacters;
            arrayToHoldCharsWithOddNumberOfOccurrence = frequencyOfDigits;

            evenFrequencyCounter = totalFrequencyOfCharacters;
            oddFrequencyCounter   = totalFrequencyOfDigits;

            base_char_for_even = 'a';
            base_char_for_odd = '0';
        }

        while (oddFrequencyCounter > 0 || evenFrequencyCounter > 0) {
            while (odd < arrayToHoldCharsWithOddNumberOfOccurrence.length && arrayToHoldCharsWithOddNumberOfOccurrence[odd] < 1) odd++;
            while (even < arrayToHoldCharsWithEvenNumberOfOccurrence.length && arrayToHoldCharsWithEvenNumberOfOccurrence[even] < 1) even++;

            if (odd < arrayToHoldCharsWithOddNumberOfOccurrence.length && arrayToHoldCharsWithOddNumberOfOccurrence[odd] > 0) {
                result.append((char) (base_char_for_odd + odd));
                arrayToHoldCharsWithOddNumberOfOccurrence[odd]--;
                oddFrequencyCounter--;
            }

            if (even < arrayToHoldCharsWithEvenNumberOfOccurrence.length && arrayToHoldCharsWithEvenNumberOfOccurrence[even] > 0) {
                result.append((char) (base_char_for_even + even));
                arrayToHoldCharsWithEvenNumberOfOccurrence[even]--;
                evenFrequencyCounter--;
            }
        }
        return result.toString();
    }
}