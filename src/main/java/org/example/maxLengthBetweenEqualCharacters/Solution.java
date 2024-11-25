package org.example.maxLengthBetweenEqualCharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLengthBetweenEqualCharacters = -1;
        int[] table = new int[128];
        Arrays.fill(table,-1);

        for (int i = 0; i < s.length() ; i++) {
            if (table[s.charAt(i)] != -1){
                maxLengthBetweenEqualCharacters = Math.max(maxLengthBetweenEqualCharacters,i - table[s.charAt(i)] -1);
            }else {
                table[s.charAt(i)] = i;
            }
        }
        return maxLengthBetweenEqualCharacters;
    }
}