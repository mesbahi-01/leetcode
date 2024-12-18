package org.example.countWords;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();

        Map<String, Integer> map2 = new HashMap<>();

        for (String word :
                words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        for (String word :
                words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }


        Iterator<Map.Entry<String, Integer>> iterator = map1.entrySet().iterator();

        for (Iterator<Map.Entry<String, Integer>> it = iterator; it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() > 1) map1.remove(entry);
        }

        Iterator<Map.Entry<String, Integer>> iterator2 = map2.entrySet().iterator();

        for (Iterator<Map.Entry<String, Integer>> it = iterator2; it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() > 1) map2.remove(entry);
        }

        int counter = 0;

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if(map1.get(entry.getKey()) == 1 && map2.getOrDefault(entry.getKey(),0) == 1)
                counter++;
        }

        return counter;

    }
}