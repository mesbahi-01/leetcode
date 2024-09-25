package org.example.detectCapitalUse;

public class Solution {
    public boolean detectCapitalUse(String word) {
        // count number of CapitalLettres
        // if it is equal to 1 or equal to word.length or equal to 0 return true
        int counter = 0;
        for (char c :
                word.toCharArray()) {
            // if c - 'A' > 25 it is not an upper case
            if (Character.isUpperCase(c)) counter++;
        }
        return ((counter == 1 && Character.isUpperCase(word.charAt(0))) || counter == word.length() || counter == 0);
    }
}