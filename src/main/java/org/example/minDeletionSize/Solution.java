package org.example.minDeletionSize;

class Solution {
    public int minDeletionSize(String[] strs) {
        int numberOfDeletedColumns = 0;

        int numberOfColumns = strs[0].length();
        int numberOfRows = strs.length ;

        for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
            for (int rowIndex = 0; rowIndex < numberOfRows - 1; rowIndex++) {
                if (strs[rowIndex].charAt(columnIndex) > strs[rowIndex + 1].charAt(columnIndex)){
                    numberOfDeletedColumns++;
                    break;
                }
            }
        }
        return numberOfDeletedColumns;
    }
}