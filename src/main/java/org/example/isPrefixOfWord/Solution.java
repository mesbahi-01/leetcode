package org.example.isPrefixOfWord;

public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // start with an index called possibleIndex
        // set it to one and increment it when ever you find a space
        // foreach charcter in the sentence
        // if sentence[i] equals searchWord[0]
        // declare a boolean variable called isEqual and set it to true
        // if all the remaining chars of searchword are equal return possibleIndex
        // search for the first space after the position i
        // if it does not exist return -1
        // increment possibleIndex by one
        // return -1 since we found nothing

        int possibleIndex = 1;

        for (int i = 0; i < sentence.length();) {
            if (sentence.charAt(i) == searchWord.charAt(0)) {
                boolean isEqual = true;
                int j = 1;
                for (++i; j < searchWord.length() && i < sentence.length(); i++, j++) {
                    if (searchWord.charAt(j) != sentence.charAt(i)) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual && (j == searchWord.length())) {
                    return possibleIndex;
                }
            }
            i = sentence.indexOf(' ', i);
            if (i == -1) break;
            i++;
            possibleIndex++;
        }
        return -1;
    }
}