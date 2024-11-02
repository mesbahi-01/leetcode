package org.example.removePalindromeSub;

class Solution {
    public int removePalindromeSub(String s) {
        int i;
        int j;
        i = s.length() / 2;
        j = s.length() / 2;
        if (s.length() % 2 == 0) i--;

        // baabb length = 5 , i = 2
        while(i > -1 && j < s.length()){
            if (s.charAt(i) == s.charAt(j)){
                i--;
                j++;
            }else {
                return Math.min(
                        removePalindromeSub(s.substring(0,j + 1)) + 1,
                        removePalindromeSub(s.substring(i)) + 1
                );
            }
        }
        return 1;
    }
}