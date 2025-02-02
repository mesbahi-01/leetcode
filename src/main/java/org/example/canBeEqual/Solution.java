package org.example.canBeEqual;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args){
        new Solution().canBeEqual("abcd","dacb");
    }
    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        // s1.length = s2.length = 4
        // respect j - i = 2
        // j = 2 ; i = 0
        // j = 3 ; i = 1

        Set<String> possiblePermutationsOfS1 = new HashSet<>();
        Set<String> possiblePermutationsOfS2 = new HashSet<>();

        possiblePermutationsOfS1.add(s1);
        possiblePermutationsOfS2.add(s2);

        for (int i = 0, j = i + 2; j < s1.length(); i++, j++) {
            StringBuilder mutable_s1_copy = new StringBuilder(s1);
            char temp = s1.charAt(i);
            mutable_s1_copy.setCharAt(i, mutable_s1_copy.charAt(j));
            mutable_s1_copy.setCharAt(j, temp);

            possiblePermutationsOfS1.add(mutable_s1_copy.toString());

            StringBuilder mutable_s2_copy = new StringBuilder(s2);
            temp = s2.charAt(i);
            mutable_s2_copy.setCharAt(i, mutable_s2_copy.charAt(j));
            mutable_s2_copy.setCharAt(j, temp);

            possiblePermutationsOfS2.add(mutable_s2_copy.toString());

            if (possiblePermutationsOfS1.contains(mutable_s2_copy.toString()) ||
                    possiblePermutationsOfS2.contains(mutable_s1_copy.toString())) {
                return true;
            }
        }
        return false;
    }
}