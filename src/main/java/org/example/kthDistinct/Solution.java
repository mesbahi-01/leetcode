package org.example.kthDistinct;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> blackList = new HashSet<>();
        for (String s :
                arr) {
            if (linkedHashSet.contains(s)) {
                linkedHashSet.remove(s);
            } else {
                linkedHashSet.add(s);
            }
            blackList.add(s);
        }


        if (k > linkedHashSet.size()) return "";
        return (String) linkedHashSet.toArray()[k - 1];
    }
}