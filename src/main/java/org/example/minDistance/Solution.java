package org.example.minDistance;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int minDistance(String word1, String word2) {
        int numberOfOperations = 0;


        Set<Character> word2_map = new HashSet<>();
        for (Character c : word2.toCharArray()) {
            word2_map.add(c);
        }


        // remove all unnecessary chars from word1
        StringBuilder container = new StringBuilder();
        for (Character c : word1.toCharArray()) {
            if (!word2_map.contains(c)) {
                numberOfOperations++;
            } else {
                container.append(c);
            }
        }

        for (Character c : word2_map) {

        }

        return 1;
    }
}