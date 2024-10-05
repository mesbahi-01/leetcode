package org.example.toLowerCase;

class Solution {
    public String toLowerCase(String s) {
        // calculate distance between 'a' and 'A'
        // if it is between A and Z
        // replace it with s[i] - calculatedDistance
        int padding = 'A' - 'a';
        char[] s_as_array_of_chars = s.toCharArray();
        for (int i = 0; i < s_as_array_of_chars.length; i++) {
            if (s_as_array_of_chars[i] >= 'A' && s_as_array_of_chars[i] <= 'Z'){
                s_as_array_of_chars[i] = (char) (s_as_array_of_chars[i] - padding);
            }
        }
        return new String(s_as_array_of_chars);
    }
}