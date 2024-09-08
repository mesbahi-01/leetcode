package org.example.lengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        // use two indexes
        // index1 start from s.length - 1
        // while s[index1] and index1 > -1 is a space decrement index1
        // index2 = index1
        // while s[index2] and index2 > -1 is not a space decrement index2
        // return index - index2
        int index1 = s.length() - 1;
        while (index1 > -1 && s.charAt(index1) == ' ') index1--;
        int index2 = index1;
        while (index2 > -1 && s.charAt(index2) != ' ') index2--;
        return index1 - index2;
    }
}