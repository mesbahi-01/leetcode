package org.example.arrayStringsAreEqual;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // declare a string join1 and initialize it with the joined word1
        // declare a string join2 and initialize it with the joined word2
        // return true if join1 is equal to join2 else return false

        String join1 = String.join("", word1);
        String join2 = String.join("", word2);

        return join1.equals(join2);
    }
}