package org.example.shortestToChar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        // find all indices of c in s
        // foreach char in s
        // fined boundaries of i in indices of c
        // if indexOfCBefore s[i] exist calculate distance and set result[i] to it
        // else set it to the highest integer possible
        // if indexOfCAfter s[i] exist calculate distance
        // and set result[i] equels to min(result[i] ,abs(indexOfCAfter - i )
        // else set result[i] to abs(indexOfCAfter - i
        // return result
        List<Integer> indexes_of_c_in_S = new ArrayList<>();
        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) indexes_of_c_in_S.add(i);
        }

        for (int i = 0; i < s.length(); i++) {
            Integer[] boundaries = findBoundaries(i, indexes_of_c_in_S);
            if (boundaries[0] != null) {
                result[i] = Math.abs(i - boundaries[0]);
            } else {
                result[i] = Integer.MAX_VALUE;
            }
            if (boundaries[1] != null) {
                result[i] = Math.min(
                        result[i],
                        Math.abs(i - boundaries[1])
                );
            }
        }
        return result;

    }

    private Integer[] findBoundaries(int i, List<Integer> indexesOfCInS) {
        Integer[] result = new Integer[2];
        int j = 0;
        while (j < indexesOfCInS.size()) {
            if (i == indexesOfCInS.get(j)) {
                result[0] = i;
                result[1] = i;
                return result;
            } else if (i < indexesOfCInS.get(j)) {
                result[1] = indexesOfCInS.get(j);
                return result;
            } else {
                result[0] = indexesOfCInS.get(j);
            }
            j++;
        }
        return result;

    }
}