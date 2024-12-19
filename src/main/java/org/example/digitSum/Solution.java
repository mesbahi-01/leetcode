package org.example.digitSum;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] ars){
        Solution solution = new Solution();
        System.out.println(solution.sumDigits(321));
    }
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            List<String> parsedString = parseBy(s, k);
            StringBuilder newString = new StringBuilder();
            for (String subString :
                    parsedString) {
                Long parsedNumber = parseLong(subString);
                newString.append(parsedNumber);
            }
            s = newString.toString();
        }
        return s;
    }

    private Long parseLong(String subString) {
        Long result = 0L;
        for (int i = 0; i < subString.length(); i++) {
            result +=  (subString.charAt(i) - '0');
        }
        return result;
    }

    private int sumDigits(int parsedNumber) {
        int result = 0;
        while (parsedNumber > 0) {
            result += parsedNumber % 10;
            parsedNumber = parsedNumber / 10;
        }
        return result;
    }

    private List<String> parseBy(String s, int k) {

        List<String> result = new ArrayList<>( );


        for (int i = 0 ; i < s.length(); i += k) {
            result.add(s.substring(i, Math.min(i + k, s.length())));
        }

        return result;
    }
}