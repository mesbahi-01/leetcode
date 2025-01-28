package org.example.equalFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public boolean equalFrequency(String word) {
        Map<Character, Integer> frequency = calculateFrequency(word);
        Map<Integer, Long> frequencyOfFrequency = frequency.values().stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        return frequencyOfFrequency.size() == 1 || frequencyOfFrequency.size() == 2 && frequencyOfFrequency.containsValue(1L);
    }

    private Map<Character, Integer> calculateFrequency(String word) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c :
                word.toCharArray()) {
            // merge
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        return frequency;
    }
}