package org.example.gcdOfStrings;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // calculate deviders of str2
        // devidersOfStr2 = str2.length % i // i starts from  1 to Math.square(str2.length)
        // foreach devidersOfStr2
        // devidesStr2IntoEqualedStrings = true

        List<Integer> largestCommanString_dividers = new ArrayList<>();
        String largestCommanString ;
        if (str1.length() < str2.length()) {
            largestCommanString = str1;
        }
        else {
            largestCommanString = str2;
        }

        for (int i = 1; i <= Math.sqrt(largestCommanString.length()); i++) {
            if (str2.length() % i == 0) largestCommanString_dividers.add(i);
        }

        for (var divider :
                largestCommanString_dividers) {
            String x = largestCommanString.substring(0, largestCommanString.length() / divider);
            if (largestCommanString.length() % x.length() != 0) continue;
            // check if x is a repeated string of str2
            boolean subRepeatedStringOfStr2 = true;
            for (int i = x.length(); i < largestCommanString.length(); i += x.length()) {
                String next = largestCommanString.substring(i, i + x.length());
                if (!next.equals(x)) {
                    subRepeatedStringOfStr2 = false;
                    break;
                }
            }

            if (!subRepeatedStringOfStr2) continue;

            // check if x can divide str1 int equals strings
            if (str1.length() % x.length() != 0) continue;
            boolean xCanDevideStr1 = true;
            for (int i = 0; i < str1.length(); i += x.length()) {
                String next = str1.substring(i, i + x.length());
                if (!next.equals(x)) {
                    xCanDevideStr1 = false;
                    break;
                }
            }
            if (xCanDevideStr1) return x;

        }
        return "";
    }
}