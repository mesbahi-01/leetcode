package org.example.commonChars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new LinkedList<>();
        int[] current;
        int[] next ;

        current = calculateFrequencyOfChars(words[0]);
        next = current;
        for (int i = 0; i < words.length - 1; i++) {
            next = calculateFrequencyOfChars(words[i + 1]);

            for (int j = 0; j < current.length; j++) {
                next[j] = Math.min(next[j], current[j]);
            }
            current = next;
        }
        for (int i = 0; i < next.length; i++) {
            if (next[i] > 0) {
                for (int j = 0; j < next[i]; j++) {
                    result.add(((char) i) + "");
                }
            }
        }
        return result;
    }

    private int[] calculateFrequencyOfChars(String word) {
        int[] result = new int[128];
        for (char c
                : word.toCharArray()
        ) {
            result[c]++;
        }
        return result;
    }
}