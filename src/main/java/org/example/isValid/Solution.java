package org.example.isValid;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public boolean isValid(String word) {
        return containsMinimum(word,3)
                && containsOnlyAlphanumiric(word)
                && containsAtLeastOneVowel(word)
                && containsAtLeastOneConsonant(word);
    }

    private boolean containsAtLeastOneConsonant(String word) {
        var vowels = getVowels();
        for (var c:word.toCharArray()) {
            if (Character.isAlphabetic(c) && !vowels.contains(c)) return true;
        }
        return false;
    }

    private boolean containsAtLeastOneVowel(String word) {
        Set<Character> vowels = getVowels();

        for (char c : word.toCharArray()){
            if (vowels.contains(c)) return true;
        }
        return false;
    }

    private Set<Character> getVowels() {
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
        vowels.addAll(
                vowels.stream().map(Character::toUpperCase).toList()
        );
        return vowels;
    }

    private boolean containsOnlyAlphanumiric(String word) {
        for (char c:word.toCharArray()){
            if (c <= 'z' && c >= 'a' || c >= 'A' && c <= 'Z' || c <= '9' && c >= '0')
                continue;
            else
                return false;
        }
        return true;
    }

    private boolean containsMinimum(String word, int i) {
        return word.length() >= i;
    }
}