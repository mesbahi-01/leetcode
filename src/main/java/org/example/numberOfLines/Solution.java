package org.example.numberOfLines;

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        // start with an array result of size 2
        // result[0] is the total number of lines.
        // result[1] is the width of the last line in pixels.
        // set result[0]  =  1 since we need at least one line to write a char from s
        // line = 100 pixels wide
        // for each char of s
            // calculate the width of that char using the formula (c - 'a')
            // if char_width <= line
                // line = line - char_width
            // else
                // increment result[0] number of lines
                // reset line to 100
                // line = line - char_width
        // result[1] = 100 - line

        final int LINE_WIDTH = 100;

        int[] result = new int[2];
        result[0]++;
        int current_line_width = LINE_WIDTH;
        int c_width;

        for (char c :
                s.toCharArray()) {
            c_width = widths[c - 'a'];
            if (c_width <= current_line_width){
                current_line_width-=c_width;
            }else{
                result[0]++;
                current_line_width= LINE_WIDTH;
                current_line_width -= c_width;
            }
        }
        result[1] = LINE_WIDTH - current_line_width;
        return result;
    }
}