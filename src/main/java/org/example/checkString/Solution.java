package org.example.checkString;

class Solution {
    public boolean checkString(String s) {
        int firstAppearnceOfA = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a') {
                firstAppearnceOfA = i;
                break;
            }
        }

        for (int i = firstAppearnceOfA - 1; i >= 0; i--) {
            if (s.charAt(i) == 'b') return false;
        }

        return true;
    }
}