package org.example.isSubstringPresent;

class Solution {
    public boolean isSubstringPresent(String s) {
        String reverseOfS = new StringBuffer(s).reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            String subStringOfLengthTwo = s.substring(i, i + 2);
            if (reverseOfS.contains(subStringOfLengthTwo)) return true;
        }
        return false;
    }
}