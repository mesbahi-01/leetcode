package org.example.areAlmostEqual;

import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.areAlmostEqual("aa", "bb"));
    }
    public boolean areAlmostEqual(String s1, String s2) {

        // there is at most two differences
        // and string_a == string_b
        // string_a = s1[i1] + s2[i1]
        // and string_b = s1[i2] + s2[i2]


        char[] a = new char[2];
        int number_of_differences = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                number_of_differences++;

                if (number_of_differences == 1) {
                    a[0] = s1.charAt(i);
                    a[1] = s2.charAt(i);
                } else if (number_of_differences == 2) {
                    if (a[0] != s2.charAt(i) || a[1] != s1.charAt(i)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return number_of_differences != 1;
    }
}