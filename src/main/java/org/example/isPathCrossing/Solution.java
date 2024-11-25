package org.example.isPathCrossing;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isPathCrossing(String path) {
        Map<Character,Integer> map = new HashMap<>(Map.of('N',0,'S',-0,'E',0,'W',-0));
        Map<Character,Character> map2 = new HashMap<>(Map.of('N','S','E','W','S','N','W','E'));


        for (Character c :
                path.toCharArray()) {
            map.compute(
                    c,
                    (k,v)->v+1
            );
            if (map.get(c) == map.get(map2.get(c))) return false;
        }
        return true;
    }
}