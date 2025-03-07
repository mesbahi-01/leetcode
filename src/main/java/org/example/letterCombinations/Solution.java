package org.example.letterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    Map<String, StringBuilder> digitToChar = getPhoneKeys();


    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (!digits.isEmpty()) {
            backTrack(0, "",digits,res);
        }
        return res;

    }

    void backTrack(int i, String curStr,String digits,List<String> res) {
        if (curStr.length() == digits.length()) {
            res.add(curStr);
            return;
        }

        for (var c : digitToChar.get(digits.charAt(i) + "").toString().toCharArray()){
            backTrack(i + 1, curStr + c,digits,res);
        }

    }

    private Map<String, StringBuilder> getPhoneKeys() {
        Map<String, StringBuilder> phoneKeys = new HashMap<>();
        Character c = 'a';
        for (Character i = '2'; i <= '9'; i++) {
            phoneKeys.put(i + "", new StringBuilder());
            int numberOfCharsPerButton = 3;
            if (i == '7' || i == '9') numberOfCharsPerButton = 4;
            for (int j = 0; j < numberOfCharsPerButton; j++, c++) {
                phoneKeys.get(i + "").append(c);
            }
        }
        return phoneKeys;
    }

}