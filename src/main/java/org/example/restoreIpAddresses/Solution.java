package org.example.restoreIpAddresses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        new Solution().restoreIpAddresses("25525511135");
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() > 12) return res;

        backTrack(0, 0, "", s, res);

        return res;
    }

    private void backTrack(int i,
                           int dots,
                           String ipAddress,
                           String s,
                           List<String> res
    ) {
        if (dots == 4 && i == s.length()) {
            res.add(ipAddress.substring(0,ipAddress.length() - 1));
            return;
        }

        if (dots > 4) return;

        for (int j = i; j < Math.min(s.length(), i + 3); j++) {
            if (Integer.parseInt(
                    s.substring(i, j + 1)
            ) < 256 && (i == j || s.charAt(i) != '0')) {
                backTrack(j + 1,
                        dots + 1,
                        ipAddress + s.substring(i, j + 1) + '.',
                        s,
                        res);
            }
        }

    }

}