package org.example.removeDuplicates;

class Solution {
    public String removeDuplicates(String s) {
        int[] result = new int[s.length()];
        // "abbaca"
        int last_index = -1;
        for (char c :
                s.toCharArray()) {
            if (last_index >= 0 && c == result[last_index]){
                last_index--;
            } else{
                last_index++;
                result[last_index] = c;
            }
        }
        return new String(result,0,last_index + 1);
    }
}