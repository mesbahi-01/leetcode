package org.example.halvesAreAlike;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    boolean[] vowels_set = new boolean[128];
    {
        for (Character c :
                List.of(
                        'a',
                        'e',
                        'i',
                        'o', 'u', 'A', 'E', 'I', 'O', 'U'
                )) {
            vowels_set[c] = true;
        }
    }
    public boolean halvesAreAlike(String s) {
        // start with two indecis left and right
        // initialize left_counter and right_counter to 0
        // foreach character of s
        // if s[i] is a vowel update the appropriate counter
        // return left_counter==right_counter

        int left = 0;
        int right = s.length() - 1;

        int counter = 0;

        for (; left < right; left++, right--) {
            if (isVowel(s.charAt(left))) counter++;
            if (isVowel(s.charAt(right))) counter--;
        }
        return counter==0;
    }

    private boolean isVowel(char c) {

        return vowels_set[c];
    }
}