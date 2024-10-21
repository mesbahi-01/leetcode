package org.example.makeFancyString;

class Solution {
    public String makeFancyString(String s) {
        // initialize counter to 1
        // declare a fancyString and add to it s[0]
        // start with two indexes i and j equals to 0
        // foreach char in s from index 1
            // if s[i] == fancyString[j] counter++;
            // else reset counter to 1
            // if counter == 3
                // continue
            // else
                // add it to fancyString and increment j
        // return fancyString
        char[] fancyString = new char[s.length()];
        int j = 0;
        fancyString[j] = s.charAt(0);
        int counter = 1;
        int i;
        for (i = 1;i < s.length(); i++){
            if (s.charAt(i) == fancyString[j]){
                counter++;
            } else {
                counter = 1;
            }

            if (counter < 3){
                fancyString[++j] = s.charAt(i);
            }
        }
        return new String(fancyString,0,j + 1);
    }
}