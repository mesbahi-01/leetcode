package org.example.trim;

public class Solution {
    public String trim(String sentence){
        // declare a string variable called trimedString
        // declare a boolean variable called spaceAllowedToBeAdded = false;
        // loop for each character of sentence
            // if you reached the end of the sentence and it is a space break the loop
            // if sentence[i] is not a ' '
                // append to trimedString
                // set spaceAllowedToBeAdded to true
            // else if sentence[i] is a space
                    // if spaceAllowedToBeAdded true
                            //  append to trimedString
                            // set spaceAllowedToBeAdded false
                    // else skip
        StringBuffer trimedString = new StringBuffer(sentence.length());
        boolean spaceAllowedToBeAdded = false;

        for (int i = 0; i <= indexOfLastChar(sentence) ; i++) {
            if (sentence.charAt(i) != ' '){
                trimedString.append(sentence.charAt(i));
                spaceAllowedToBeAdded = true;
            } else {
                if (spaceAllowedToBeAdded) {
                    trimedString.append(sentence.charAt(i));
                    spaceAllowedToBeAdded = false;
                }
            }
        }
        return trimedString.toString();
    }

    private int indexOfLastChar(String sentence) {
        int index = -1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ')
                index = i;
        }
        return index;
    }
}
