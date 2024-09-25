package org.example.repeatedSubstringPattern;

import java.util.LinkedList;
import java.util.List;

class Solution {
    Integer[] primes = new Integer[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
            37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
            79, 83, 89, 97, 101, 103, 107, 109, 113 };
    public boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        for(Integer prime: primes) {
            int maxSize = n / prime;
            if(maxSize < 1) return false;
            if(n % maxSize == 0) {
                boolean sol = true;
                String part = str.substring(0, maxSize);
                for(int i = 1; maxSize*(i+1) <= n; i++) {
                    String substring = str.substring(maxSize*i, maxSize*(i+1));
                    if(!substring.equals(part)) {
                        sol = false;
                        break;
                    }
                }
                if(sol == true) return sol;
            }
        }
        return false;
    }
}