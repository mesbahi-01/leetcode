package org.example.reformatNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String reformatNumber(String number) {
        // create a function to remove spaces and dashes
        // start with an index equals to 0;
        // declare a result of type List<String>
        // while index < formattedString.length
        // lengthToAdd = 0;
        // if formattedString.length - index == 4 or 2 lengthToAdd = 2;
        // append to result the subString from index to index + 2 in formattedString
        //

        String reformattedNumber = removeCharsFromString(number, ' ', '-');
        List<String> result = new LinkedList<>();
        int i;
        for (i = 0; i < reformattedNumber.length() - 4; ) {
            result.add(reformattedNumber.substring(i, i + 3));
            i += 3;
        }
        if (reformattedNumber.length() - i == 4) {
            for (int j = 0; j < 2; j++) {
                result.add(reformattedNumber.substring(i, i + 2));
                i+=2;
            }
        }else{
                result.add(reformattedNumber.substring(i));
        }

        return result.stream().collect(Collectors.joining("-"));
    }

    private String removeCharsFromString(String number, char c1, char c2) {
        StringBuilder result = new StringBuilder(number.length());
        for (char c :
                number.toCharArray()) {
            if (c != c1 && c != c2) {
                result.append(c);
            }
        }
        return result.toString();
    }
}