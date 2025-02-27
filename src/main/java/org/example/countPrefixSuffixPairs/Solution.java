package org.example.countPrefixSuffixPairs;

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int counter = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefix(words[i], words[j]) && isSuffix(words[i], words[j])) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private boolean isSuffix(String word, String word1) {
        int i = word.length() - 1;
        int j = word1.length() - 1;

        while (i >= 0 && j >= 0) {
            if (word.charAt(i) != word1.charAt(j)) break;
            i--;
            j--;
        }

        return i < 0;
    }

    private boolean isPrefix(String word, String word1) {
        int i = 0;
        int j = 0;

        while (i < word.length() && j < word1.length()) {
            if (word.charAt(i) != word1.charAt(j)) break;
            i++;
            j++;
        }

        return i == word.length();
    }
}