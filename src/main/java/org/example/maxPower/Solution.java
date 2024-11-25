package org.example.maxPower;

class Solution {
    public int maxPower(String s) {
        // if s.length == 0 or 1 return s.length
        // initialize current char with the first character from s
        // start with a maxPower equals to 1
        // initialize a counter to 1
        // for each next char of s
            // if currentChar == s[i] counter++ and i++
            // else
                // maxPower = max(maxPower,counter)
                // current = s[i]
                // counter = 1
        // return maxPower

        char current = s.charAt(0);
        int maxPower = 1;
        int counter = 1;
        for (int i = 1; i < s.length(); i++) {
            if (current != s.charAt(i)){
                maxPower = Math.max(maxPower,counter);
                counter = 1;
                current = s.charAt(i);
            }else counter++;
        }
        return  Math.max(maxPower,counter);

    }
}