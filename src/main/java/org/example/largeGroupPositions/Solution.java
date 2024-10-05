package org.example.largeGroupPositions;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();

        // counter = 1 ; i = 0 ; j = i
        // while j < s.length - 1
        // if s[i]==s[j+1]
        // j++ and counter++
        // else
        // if counter >= 3 it is considered a large group
        // add to the result [i,j]
        // reset counter to 1 and i to j + 1

        int i = 0;
        int j = 1;
        int counter = 1;

        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                counter++;
            } else {
                if (counter > 2) {
                    List<Integer> group = new ArrayList<>();
                    group.add(i);
                    group.add(j - 1);
                    result.add(group);
                }
                counter = 1;
                i = j;
                j++;
            }
        }
        if (counter > 2) {
            List<Integer> group = new ArrayList<>();
            group.add(i);
            group.add(j - 1);
            result.add(group);
        }
        return result;
    }
}