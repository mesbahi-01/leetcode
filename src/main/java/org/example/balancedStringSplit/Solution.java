package org.example.balancedStringSplit;

class Solution {
    public int balancedStringSplit(String s) {
        // declare a maximum_number_of_balanced_strings and initialized it with 0
        // declare two variables R_counter and L_counter
        // for each character of s
            // if s[i] is R increment R_counter else increment L_counter
            // if R_counter equals L_counter
                // increment maximum_number_of_balanced_strings
                // reset R_counter and L_counter
        // return maximum_number_of_balanced_strings
        int maximum_number_of_balanced_strings = 0;

        int R_counter = 0;
        int L_counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                R_counter++;
            } else {
                L_counter++;
            }

            if (R_counter == L_counter) {
                maximum_number_of_balanced_strings++;
                R_counter = 0;
                L_counter = 0;
            }
        }
        return maximum_number_of_balanced_strings;
    }
}