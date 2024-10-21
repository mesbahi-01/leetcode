package org.example.diStringMatch;

class Solution {
    public int[] diStringMatch(String s) {
        int maximumValue = s.length();
        int minValue = 0;

        int[] result = new int[s.length() + 1];
        int k = 0;

        char[] cs = s.toCharArray();


        for(int i =0;i<cs.length;i++){
            if(cs[i]=='I'){
                result[i]=minValue;
                minValue++;
                continue;
            }
            result[i]=maximumValue;
            maximumValue--;
        }
            result[cs.length] = minValue;

        return result;
    }
}