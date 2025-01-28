package org.example.isCircularSentence;

class Solution {
    public boolean isCircularSentence(String sentence) {

        int space_index = sentence.indexOf(' ');

        while (space_index != -1) {
            if (sentence.charAt(space_index - 1)
                    != sentence.charAt(space_index + 1)) return false;
            space_index = sentence.indexOf(' ', space_index + 1);
        }

        return (sentence.charAt(0) != sentence.charAt(sentence.length() - 1));
    }
}