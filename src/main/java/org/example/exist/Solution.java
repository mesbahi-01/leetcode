package org.example.exist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        new Solution().exist(new char[][]{
                {'A', 'B', 'C', 'E'}
                , {'S', 'F', 'C', 'S'}
                , {'A', 'D', 'E', 'E'}
        }, "ABCCED");
    }

    public boolean exist(char[][] board, String word) {
        int ROWS = board.length, COLS = board[0].length;
        Set<StringBuilder> paths = new HashSet<>();

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (dfs(r,c,0,word,board,paths)) return true;
            }
        }
        return false;
    }

    public boolean dfs(int r,
                       int c,
                       int index,
                       String word,
                       char[][] board,
                       Set<StringBuilder> paths) {
        if (index == word.length()) return true;
        if (r < 0 || c < 0
                || r >= board.length
                || c >= board[0].length
                || word.charAt(index) != board[r][c]
                || paths.contains(new StringBuilder().append(r).append("**").append(c))) {
            return false;
        }


        paths.add(new StringBuilder().append(r).append("**").append(c));

        boolean response = dfs(r, c + 1, index + 1,
                word,
                board,
                paths) ||
                dfs(r, c - 1, index + 1,
                        word,
                        board,
                        paths) ||
                dfs(r + 1, c, index + 1,
                        word,
                        board,
                        paths) ||
                dfs(r - 1, c, index + 1,
                        word,
                        board,
                        paths);

        paths.remove(new StringBuilder().append(r).append("**").append(c));

        return response;

    }
}