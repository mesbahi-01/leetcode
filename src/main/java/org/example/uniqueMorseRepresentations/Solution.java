package org.example.uniqueMorseRepresentations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] array = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), array[i]);
        }

        for (String word :
                words) {
            String transformation = transform(word, array);
            set.add(transformation);
        }
        return set.size();
    }

    private String transform(String word, String[] array) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            s.append(
                    array[word.charAt(i) - 'a']
            );
        }
        return s.toString();
    }


}