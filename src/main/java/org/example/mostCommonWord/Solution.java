package org.example.mostCommonWord;

import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String paragraph_lowerCased = paragraph.toLowerCase();
        Set<String> set_of_banned_words = new HashSet<>(List.of(banned));
        String[] paragraph_lowerCased_words = extractWords(paragraph_lowerCased);
        Map<String, Integer> unbanned_words_frequency = new HashMap<>();
        for (String word :
                paragraph_lowerCased_words) {
            if (!set_of_banned_words.contains(word)) {
                unbanned_words_frequency.put(word, unbanned_words_frequency.getOrDefault(word, 0) + 1);
            }
        }
        Map.Entry<String, Integer> unbanned_word_with_highest_frequency = unbanned_words_frequency.entrySet().stream().min(
                (entry1, entry2) -> entry2.getValue() - entry1.getValue()
        ).get();
        return unbanned_word_with_highest_frequency.getKey();
    }

    private String[] extractWords(String paragraphLowerCased) {
        List<String> list_of_words = new LinkedList<>();
        StringBuilder word = new StringBuilder();
        for (char c :
                paragraphLowerCased.toCharArray()) {
            if (Character.isAlphabetic(c)) word.append(c);
            else {
                if (!word.isEmpty()) {
                    list_of_words.add(word.toString());
                    word = new StringBuilder();
                }
            }
        }
        if (!word.isEmpty()) list_of_words.add(word.toString());
        return list_of_words.toArray(new String[0]);
    }
}