package org.example.findWordsContaining;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // declare a list to hold indexes of words containing the char x
        // loop through the array <words>
        // if the word[i] contains the character x add i to list_of_indexes
        // finaly return list_of_indexes
        List<Integer> list_of_indexes = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                list_of_indexes.add(i);
            }
        }

        return list_of_indexes;
    }
}