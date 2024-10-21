package org.example.findOcurrences;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        List<String> result = new LinkedList<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)){
                if (i + 2 < words.length)
                    result.add(words[i + 2]);
            }
        }
        return result.toArray(new String[0]);
    }

}