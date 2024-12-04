package org.example.checkIfPangram;

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] array_of_chars = new boolean[128];

        for (char c :
                sentence.toCharArray()) {

            array_of_chars[c] = true;
        }

        for (char c = 'a' ; c <= 'z' ; c++) {
            if (!array_of_chars[c]) return false;
        }
        return true;

    }
}