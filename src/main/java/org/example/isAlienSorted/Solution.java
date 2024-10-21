package org.example.isAlienSorted;

import java.util.HashMap;
import java.util.List;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // start with a map of char_index
        HashMap<Character, Integer> order_map = new HashMap<>();
        int i = 0;
        for (char c :
                order.toCharArray()) {
            order_map.put(c, i++);
        }

        for (int j = 0; j < words.length - 1; j++) {
            int k = 0, l = 0;
            String current = words[j];
            String next = words[j + 1];

            while (k < current.length() && l < next.length()
                    && current.charAt(k) == next.charAt(l)) {
                k++;
                l++;
            }
            if (l == next.length() && current.length() > next.length()) return false;

            if (k == current.length()) continue;

            if (order_map.get(next.charAt(l)) < order_map.get(current.charAt(k))) return false;
        }
        return true;
    }
}