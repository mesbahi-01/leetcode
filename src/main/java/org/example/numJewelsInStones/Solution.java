package org.example.numJewelsInStones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int counter = 0;
        int[] pos = new int[('z' - 'A') +1];

        for (int i = 0; i < stones.length(); i++) {
            pos['z' - stones.charAt(i)]++;
        }

        for (int i = 0; i < jewels.length(); i++) {
            counter += pos['z' - jewels.charAt(i) ];
        }
        return counter;
    }
}