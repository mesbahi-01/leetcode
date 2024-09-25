package org.example.findWords;

import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        // start with three variables of type string,
        // each one contains the characters of a rwo on the keyboard
        // declare a list of strings called result
        // next creat a map of <character, row>
        // foreach word[i]
            // find the row of word[i].charAt(0)
            // foreach charcter of word[i]
                // if one of them points to a different row skip this word
            // at the end add word[i] since all chars are at the same row
        // return result

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> result = new LinkedList<>();
        Map<Character, Integer> rowMap = new HashMap<>();
        for (char c : row1.toCharArray()) rowMap.put(c, 1);
        for (char c : row2.toCharArray()) rowMap.put(c, 2);
        for (char c : row3.toCharArray()) rowMap.put(c, 3);
        for (String word : words) {
            int row = rowMap.get(Character.toLowerCase(word.charAt(0)));
            boolean isSameRow = true;
            for (char c : word.toCharArray()) {
                if (rowMap.get(Character.toLowerCase(c)) != row) {
                    isSameRow = false;
                    break;
                }
            }
            if (isSameRow) result.add(word);
        }
        return result.toArray(new String[0]);
    }
}