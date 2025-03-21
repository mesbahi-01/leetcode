package org.example.groupAnagrams;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // foreach s of strs
            // sort chars of s
            // if the sorted s is in the map
            //   add it the value (which is an array) mapped by the key
            // else
                // create a new key and a value initialized to an empty array

        Map<String,List<String>> key_value = new HashMap<>();

        for (var s:strs){
            String key = sort(s);
            if (key_value.containsKey(key)){
                key_value.get(key).add(s);
            }else{
                List<String> arr = new ArrayList<>();
                arr.add(s);
                key_value.put(key, arr);
            }
        }

        return new ArrayList<>(key_value.values());


    }

    private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}