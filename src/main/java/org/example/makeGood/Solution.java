package org.example.makeGood;

class Solution {
    public String makeGood(String s) {
        char[] result = new char[s.length()];
        int j = -1;
        for (int i = 0; i < s.length(); i++) {
            if (j < 0 || result[j] == s.charAt(i) || (Character.toLowerCase(result[j]) != Character.toLowerCase(s.charAt(i)))){
                result[++j] = s.charAt(i);
            }else{
                j--;
            }
        }
        return new String(result,0,j + 1);
    }
}