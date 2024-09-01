package org.example.reversePrefix;

class Solution {
    public String reversePrefix(String word, char ch) {
        // declare a string called reversedPrefix;
        // find the index of the first occurrence of <ch>
        // initialize i with index_of_first_occurrence_of_ch ;
        // loop through the word from index_of_first_occurrence_of_ch to 0
        // append the character at index i to reversedPrefix
        // decrement i by 1
        // append the substring of word from index_of_first_occurrence_of_ch + 1 to the end of the word to reversedPrefix
        // return reversedPrefix

        StringBuffer reversedPrefix = new StringBuffer(word.length());
        int index_of_first_occurrence_of_ch = word.indexOf(ch);
        int i = index_of_first_occurrence_of_ch;
        while (i >= 0) {
            reversedPrefix.append(word.charAt(i));
            i--;
        }
        for (int j = index_of_first_occurrence_of_ch + 1; j < word.length(); j++) {
            reversedPrefix.append(word.charAt(j));
        }
        return reversedPrefix.toString();
    }
}