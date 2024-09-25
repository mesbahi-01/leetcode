package org.example.countSegments;

public class Solution {
    public int countSegments(String s) {

        int counter = 0;

        int index_of_last_char = s.length() - 1;

        while(index_of_last_char >= 0
                && s.charAt(index_of_last_char) == ' ')
            index_of_last_char--;

        boolean incrementCounter = true;

        for (int i = 0;
                i <= index_of_last_char; i++) {
            if (s.charAt(i) != ' ') {
                if (incrementCounter){
                    counter++;
                    incrementCounter = false;
                }
            }
            else {
                incrementCounter = true;
            }// AZ B  C
        }
        return counter;
    }
}