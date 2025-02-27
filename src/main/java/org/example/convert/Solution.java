package org.example.convert;

class Solution {
    public static void main(String[] args) {
        new Solution().convert("PAYPALISHIRING", 4);
    }

    /**
     * Converts a given string into a zigzag pattern on a specified number of rows
     * and reads it row by row to produce a transformed string.
     *
     * @param s the input string to convert
     * @param numRows the number of rows to arrange the zigzag pattern
     * @return the string representation of the zigzag pattern read row by row
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder result = new StringBuilder(s.length());

        for (int r = 0; r < numRows; r++) {
            int increment = (numRows - 1) * 2;

            for (int i = r; i < s.length(); i += increment) {
                result.append(s.charAt(i));

                if (r > 0 && r < numRows - 1 && i + increment - 2 * r < s.length()) {
                    result.append(s.charAt(i + increment - 2 * r));
                }
            }
        }
        return result.toString();
    }
}