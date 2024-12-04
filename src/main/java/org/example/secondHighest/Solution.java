package org.example.secondHighest;

import java.util.*;

class Solution {
    public int secondHighest(String s) {

        int second = 2;

        for(char c = '9'; c >= '0'; c--) {
            if(s.indexOf(c) != -1) {
                second--;
                if(second == 0) {
                    return c - '0';
                }
            }
        }
        return -1;

    }
}