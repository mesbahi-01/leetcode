package org.example.findRestaurant;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // start with a min equals to the length of both lists
        // create a map using list1 elements and indexes
        // create a map using list2 elements and indexes
        // create a third map to hold elements do exist in both lists ,
        // and their indexes sum and update the min value
        // foreach element of the third_map
            // if it is equal to min then add it the list result
        // return list result

        int min = list1.length + list2.length;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> third_map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int sum = map1.get(key) + map2.get(key);
                third_map.put(key, sum);
                min = Math.min(min, sum);
            }
        }
        List<String> result = new LinkedList<>();
        for (String key : third_map.keySet()) {
            if (third_map.get(key) == min) {
                result.add(key);
            }
        }
        return result.toArray(new String[0]);
    }
}