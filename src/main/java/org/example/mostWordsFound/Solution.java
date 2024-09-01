package org.example.mostWordsFound;

class Solution {
    public int mostWordsFound(String[] sentences) {
        // declare a variable to hold mostWordsFound in a sentence
        // and initialize it with 0
        // loop through each sentence
            // count number of words in each one
            // if it is greater then mostWordsFound assign it to it
        // return mostWordsFound
        int mostWordsFound = 0;

        for (String sentence :
                sentences) {
            int counter = countNumberOfWords(sentence);
            mostWordsFound = Math.max(counter,mostWordsFound);
        }
        return mostWordsFound;
    }

    private int countNumberOfWords(String sentence) {
        if (sentence.isEmpty()) return 0;
        int counter = 1;
        for (char c :
                sentence.toCharArray()) {
            if (c == ' ') counter++;
        }
        return counter;
    }
}