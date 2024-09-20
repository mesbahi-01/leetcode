package org.example.canConstruct;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // declare an array of a size equals to 26
        // to calculate the frequency of each char from magazine.
        // foreach char from ransomNote
            // if array[ransomNote[i] - 'a'] <= 0 return false
            // else decrement array[ransomNote[i] - 'a']
        // return true
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] <= 0) return false;
            freq[c - 'a']--;
        }
        return true;

    }
}