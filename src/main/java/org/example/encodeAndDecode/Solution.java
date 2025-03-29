package org.example.encodeAndDecode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String encode = new Solution().encode(List.of("neet", "code", "love", "you"));
        String decode = new Solution().decode(encode).toString();
    }

    public String encode(List<String> strs) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < strs.size(); i++) {
            result.append(strs.get(i).length()).append("#").append(strs.get(i));

        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length();  ) {
            StringBuffer word = new StringBuffer();

            int numberOfCharsToRead = 0;
            int indexOfSeparator = str.indexOf('#', i);
            if (indexOfSeparator != -1 && i != indexOfSeparator)
                numberOfCharsToRead = Integer.parseInt(str.substring(i,indexOfSeparator));

            i = indexOfSeparator + 1;
            while (i < str.length() && (numberOfCharsToRead--) > 0)
                word.append(str.charAt(i++));

            result.add(word.toString());
        }
        return result;
    }
}
