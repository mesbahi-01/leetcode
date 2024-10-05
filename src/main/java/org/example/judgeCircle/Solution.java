package org.example.judgeCircle;

class Solution {
    public boolean judgeCircle(String moves) {
        // start with a table of size 128
        // for each move
        // increment the value of the move in the table
        // check if the value of 'L' is equal to 'R' and 'U' is equal to 'D'
        int[] table = new int[128];
        for (char move : moves.toCharArray()) {
            table[move]++;
        }
        return table['L'] == table['R'] && table['U'] == table['D'];
    }
}