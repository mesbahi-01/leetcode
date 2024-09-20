package org.example.findTheDifference;

public class Solution {
    /*
        public char findTheDifference(String s, String t) {
            // the idea is to find where the frequency of chars differs
            int[] s_characters_frequency = new int[26];
            int[] t_characters_frequency = new int[26];
            for (int i = 0; i < s.length(); i++) {
                s_characters_frequency[s.charAt(i) - 'a']++;
                t_characters_frequency[t.charAt(i) - 'a']++;
            }
            t_characters_frequency[t.charAt(t.length() - 1) - 'a']++;

            for (int i = 0; i < 26; i++) {
                if (s_characters_frequency[i] != t_characters_frequency[i])
                    return (char) (i + 'a');
            }
            return 0;
        }
    */
//    public char findTheDifference(String s,String t){
//        // the idea is to calculate the difference between the two strings ascii values
//        int difference = 0;
//        for (int i = 0; i < s.length(); i++) {
//            difference += t.charAt(i) - s.charAt(i);
//        }
//        difference += t.charAt(t.length() - 1);
//        return (char) difference;
//
//    }
    public char findTheDifference(String s, String t) {
        // the idea is to calculate the xor of the two strings
        char result = 0;


        for (char c : s.toCharArray()) {
            result = (char) (result ^ c);
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
}