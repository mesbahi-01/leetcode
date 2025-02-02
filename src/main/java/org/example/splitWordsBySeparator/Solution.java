package org.example.splitWordsBySeparator;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String word :
                words) {
            List<String> splitWords = splitWordBySeparator(word,separator);
            result.addAll(splitWords);
        }
        return result;
    }

    private List<String> splitWordBySeparator(String word, char separator) {
        StringBuilder fraction = new StringBuilder();
        List<String> result = new ArrayList<>();
        for (char c:
             word.toCharArray()) {
            if (c == separator){
                if (!fraction.isEmpty()){
                    result.add(fraction.toString());
                    fraction = new StringBuilder();
                }
            }else {
                fraction.append(c);
            }
        }

        if (!fraction.isEmpty()){
            result.add(fraction.toString());
        }
        return result;
    }
}