package org.example.reorderSpaces;

class Solution {
    public String reorderSpaces(String text) {
        // calculate number of spaces
        // calculate number of words
        // calculate number of spaces for each peer of words
        // reconstructs text
        int numberOfSpaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') numberOfSpaces++;
        }
        int numberOfWords = 0;
        boolean upComingSpaceCanBeCount = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                upComingSpaceCanBeCount = true;
            } else {
                if (upComingSpaceCanBeCount) {
                    numberOfWords++;
                    upComingSpaceCanBeCount = false;
                }
            }
        }
        if (text.length() > 0 && text.charAt(text.length() - 1) != ' ') numberOfWords++;

        int numberOfSpacesPerPeer = 0;
        int padding = 0;
        if (numberOfWords == 1)
            padding = numberOfSpaces;
        else {
            numberOfSpacesPerPeer = numberOfSpaces / (numberOfWords - 1);
            padding = numberOfSpaces % (numberOfWords - 1);
        }


        char[] result_text = new char[text.length()];
        int index_j = 0;
        upComingSpaceCanBeCount = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                upComingSpaceCanBeCount = true;
                if (index_j < text.length())
                    result_text[index_j++] = text.charAt(i);
            } else {
                if (upComingSpaceCanBeCount) {

                    for (int j = 0; j < numberOfSpacesPerPeer && index_j < text.length(); j++) {
                        result_text[index_j++] = ' ';
                    }

                    upComingSpaceCanBeCount = false;
                }
            }
        }
        if (padding > 0 )
            for (int j = 0; j < padding && index_j < text.length(); j++) {
                result_text[index_j++] = ' ';
            }
        return new String(result_text);
    }
}