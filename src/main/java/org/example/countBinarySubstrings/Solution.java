package org.example.countBinarySubstrings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int countBinarySubstrings(String s) {
        char[] arr = s.toCharArray();
        int length = s.length();

        int counter=0;
        int curr = 1;
        int prev = 0;

        for (int i=1; i<length; i++) {
            if (arr[i] == arr[i - 1]) curr++;
            else {
                // 000111
                counter += Math.min(curr,prev);
                prev = curr;
                curr = 1;

            }
        }
            counter += Math.min(curr,prev);
        return counter;
    }
}