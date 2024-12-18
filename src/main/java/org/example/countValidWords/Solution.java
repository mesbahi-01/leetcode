package org.example.countValidWords;

class Solution {
    public int countValidWords(String sentence) {
        StringBuilder word = new StringBuilder();

        int numberOfValidWords = 0;

        for (int i = 0, sentenceLength = sentence.length(); i < sentenceLength; i++) {

            while (i < sentenceLength && sentence.charAt(i) != ' ') {
                word.append(sentence.charAt(i));
                i++;
            }

            if (!word.isEmpty()) {
                if (isValidWord(word.toString())) numberOfValidWords++;
                word = new StringBuilder();
            }
        }
        return numberOfValidWords;

    }

    private boolean isValidWord(String word) {
        return containsNoDigits(word) && hasValidHyphen(word) && hasValidPunctuationMarks(word);
    }

    private boolean hasValidPunctuationMarks(String word) {

        return hasValidPunctuationMark(word,'.') &&
                hasValidPunctuationMark(word,'!') &&
                hasValidPunctuationMark(word,',');
    }

    private boolean hasValidPunctuationMark(String word,char punctuationCharacter) {
        int punctuationIndex = word.indexOf(punctuationCharacter);
        if (punctuationIndex == -1 ) return true;

        return punctuationIndex == (word.length() - 1);
    }

    private boolean hasValidHyphen(String word) {
        int hyphenIndex = -1;


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '-') {
                if (hyphenIndex == -1) {
                    hyphenIndex = i;
                }else return false;
            }
        }

        if (hyphenIndex == -1) return true;

        if (hyphenIndex == 0 || hyphenIndex == word.length() - 1) return false;

        char previousChar = word.charAt(hyphenIndex - 1);
        char nextChar = word.charAt(hyphenIndex + 1);

        return Character.isLowerCase(previousChar) &&
                Character.isLowerCase(nextChar);
    }

    private boolean containsNoDigits(String word) {
        for (char c :
                word.toCharArray()) {
            if (Character.isDigit(c)) return false;
        }
        return true;
    }
}