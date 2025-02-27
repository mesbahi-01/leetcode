package org.example.convert;

class Solution {
    public static void main(String[] args) {
        new Solution().convert("PAYPALISHIRING", 4);
    }

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