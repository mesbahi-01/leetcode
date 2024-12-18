package org.example.countVowelSubstrings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int i = s.countVowelSubstrings("aeiouu");
        System.out.println(i);
    }

    // "cuaieuouac"
    // loop through characters of word
    // extract a substring of length 5
    // if it has all vowels do the following
    // increment counter by one
    // while previous chars are vowels
    // increment counter
    // while next chars are vowels
    // increment counter
    // return counter
    Set<Character> vowelsSet = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));

    public int countVowelSubstrings(String word) {
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))){
                Set<Character> collectedVowels = new HashSet<>(5);
                collectedVowels.add(word.charAt(i));
                int j = i +1;
                while (j < word.length() && isVowel(word.charAt(j))){
                    collectedVowels.add(word.charAt(j));
                    if (collectedVowels.size() >= vowelsSet.size()) counter++;
                    j++;
                }

            }
        }
        return counter;
    }

    private boolean isVowel(char c) {
        return vowelsSet.contains(c);
    }



}