package org.example.cellsInRange;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> cellsInRange(String s) {
        // declare an array of strings to hold cells in range
        // declare a constant called maximumColumnToGoTo
        // declare a constant called maximumRowToGoTo
        // for loop to maximumColumnToGoTo
        //
        String cellOne = s.substring(0, 2);
        String cellTwo = s.substring(3);

        int  maximumNumberOfColumns= cellTwo.charAt(0) - cellOne.charAt(0) + 1;
        int  maximumNumberOfRows= Integer.parseInt(cellTwo.substring(1))
                - Integer.parseInt(cellOne.substring(1))
                + 1;
        int numberOfCells = maximumNumberOfColumns * maximumNumberOfRows;

        List<String> cellsInRange = new ArrayList<>(numberOfCells);
        for (char i = cellOne.charAt(0); i <= cellTwo.charAt(0); i++) {
            for (char j = cellOne.charAt(1); j <= cellTwo.charAt(1); j++) {
                cellsInRange.add(i + "" +j);
            }
        }
        return cellsInRange;

    }
}