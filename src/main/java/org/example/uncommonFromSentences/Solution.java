package org.example.uncommonFromSentences;

import java.util.*;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // counte frequency of each word
        // resturn words with frequency equals to 1
        List<String> result = new LinkedList();
        Map<String,Integer> map = new HashMap<>();

        for (String word :
                s1.split(" ")) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        for (String word :
                s2.split(" ")) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }

        for (String word :
                map.keySet()) {
            if (map.get(word) == 1) result.add(word);
        }
        return result.toArray(new String[0]);

    }
}