package org.example.rearrangeCharacters;

class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] frequency_in_s = calculateFrequency(s);
        int[] frequency_in_target = calculateFrequency(target);

        int maximumTargetsCanBeCreatedFromS = Integer.MAX_VALUE;

        for (char c :
                target.toCharArray()
        ) {
            maximumTargetsCanBeCreatedFromS = Math.min(maximumTargetsCanBeCreatedFromS,
                    frequency_in_s[c - 'a'] / frequency_in_target[c - 'a']);
        }
        return maximumTargetsCanBeCreatedFromS;
    }

    private int[] calculateFrequency(String s) {
        int[] f = new int[26];
        for (char c :
                s.toCharArray()) {
            f[c - 'a']++;
        }
        return f;
    }
}