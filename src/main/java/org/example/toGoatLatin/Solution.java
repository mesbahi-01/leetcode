package org.example.toGoatLatin;

import java.util.HashSet;
import java.util.List;

class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        StringBuilder suffix = new StringBuilder("a");

        HashSet<Character> setOfVowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u','A','E','I','O','U'));

        for (int i = 0; i < sentence.length(); i++) {
            if (setOfVowels.contains(sentence.charAt(i))) {
                result.append(sentence.charAt(i++));
                while (i < sentence.length() && sentence.charAt(i) != ' ') {
                    result.append(sentence.charAt(i++));
                }
            } else if (sentence.charAt(i) != ' ') {
                char c = sentence.charAt(i++);
                while (i < sentence.length() && sentence.charAt(i) != ' ') {
                    result.append(sentence.charAt(i++));
                }
                result.append(c);
            }
            result.append("ma").append(suffix);
            suffix.append('a');
            if (i < sentence.length() - 1){
                result.append(' ');
            }

        }
        return result.toString();
    }
}