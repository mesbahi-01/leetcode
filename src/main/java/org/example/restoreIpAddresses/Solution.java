package org.example.restoreIpAddresses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        // one construct all possible addresses
        // two filter those addresses to keep only the valid ones

        // ok so what we know on ip addresses
        // there four segments x.x.x.x
        // each segment can have 3 digits or fewer (0-255)

        // ok start with
        // segment one has one digit
        // segment one has two digits
        // segment two has three digits

        // Input: s = "101023"
        // Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]

        if (s.length() > 12) return new ArrayList<>();

        Set<String> result = new HashSet<>();

        recursive("", s, 0, result);

        result = filerInvalidIpAddresses(result);

        return result.stream().toList();
    }

    private Set<String> filerInvalidIpAddresses(Set<String> result) {
        return result.stream().filter(
                Solution::isValidIpAddress
        ).collect(Collectors.toSet());
    }

    private static boolean isValidIpAddress(String s) {
        String[] segments = s.split("\\.");

        for (String segment : segments) {
            if ((segment.charAt(0) == '0' && segment.length() > 1) ||
            Integer.parseInt(segment) > 255) return false;
        }

        return true;

    }


    private void recursive(String ipAddress, String s, int numberOfSegments, Set<String> container) {

        if (numberOfSegments == 4) {
            if (s.isEmpty()) container.add(ipAddress.substring(0,ipAddress.length() - 1));
            else return;
        }

        if (!s.isEmpty())
            recursive(ipAddress + s.charAt(0) + ".", s.substring(1), numberOfSegments + 1, container);
        if (s.length() >= 2)
            recursive(ipAddress + s.substring(0, 2) + ".", s.substring(2), numberOfSegments + 1, container);
        if (s.length() >= 3)
            recursive(ipAddress + s.substring(0, 3) + ".", s.substring(3), numberOfSegments + 1, container);
    }
}