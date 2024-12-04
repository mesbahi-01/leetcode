package org.example.checkOnesSegment;

class Solution {
    public boolean checkOnesSegment(String s) {
        // [11]000[1]
        // the idea is to count the number of contiguous ones
        int contiguous_segment_of_ones = 0;
        char previous = ' ';

        for (int index = 0, s_length = s.length(); index < s_length ; index++) {
            if (s.charAt(index) != previous && s.charAt(index) == '1') {
                contiguous_segment_of_ones++;
            }
            previous = s.charAt(index);
            if (contiguous_segment_of_ones > 1) break;
        }
        return contiguous_segment_of_ones == 1;
    }
}