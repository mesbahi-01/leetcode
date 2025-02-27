package org.example.convert;

class Solution {
    public static void main(String[] args) {
        new Solution().convert("PAYPALISHIRING", 4);
    }

    public String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder(s.length());
        int numberOfColumns = s.length();

        char[][] matrix = new char[numRows][numberOfColumns];
        for (int i = 0; i < numRows; i++) {
            for (int col = 0; col < numberOfColumns; col++) {
                matrix[i][col] = Character.MIN_VALUE;
            }
        }

        int column = 0;
        int k = 0;

        while (k < s.length()) {
            for (int i = 0; i < numRows && k < s.length(); i++) {
                matrix[i][column] = s.charAt(k);
                k++;
            }

            for (int i = numRows - 2; i > 0 && k < s.length(); i--) {
                column++;
                matrix[i][column] = s.charAt(k);
                k++;
            }
            column++;
        }


        for (int row = 0; row < numRows; row++) {
            for (column = 0; column < numberOfColumns; column++) {
                if (matrix[row][column] != Character.MIN_VALUE)
                    result.append(matrix[row][column]);
            }
        }

        return result.toString();
    }
}