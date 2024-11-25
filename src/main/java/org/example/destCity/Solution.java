package org.example.destCity;

import java.util.*;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> departures = new HashSet<>((int) (paths.size() * 1.75));

        for (List<String> entry : paths) {
            departures.add(entry.get(0));
        }

        for (List<String> from_to : paths) {
            if (!departures.contains(from_to.get(1))) {
                return from_to.get(1);
            }
        }

        return null;
    }
}