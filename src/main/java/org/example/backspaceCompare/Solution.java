package org.example.backspaceCompare;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int index_s = s.length() - 1;
        int index_t = t.length() -1;

        int hashtags_counter_in_s = 0;
        int hashtags_counter_in_t = 0;

        while(index_s > -1 || index_t > -1){

            while(index_s > -1 ){
                if (s.charAt(index_s) == '#') hashtags_counter_in_s++;
                else if (hashtags_counter_in_s > 0) hashtags_counter_in_s--;
                else break;
                index_s--;
            }

            while(index_t > -1 ){
                if (t.charAt(index_t) == '#') hashtags_counter_in_t++;
                else if (hashtags_counter_in_t > 0) hashtags_counter_in_t--;
                else break;
                index_t--;
            }

            if (index_t > -1 && index_s > -1  && s.charAt(index_s) != t.charAt(index_t)) return false;

            if ((index_t >= 0) != (index_s >= 0)) return false;
            index_s--;
            index_t--;

        }

        return true;

    }
}