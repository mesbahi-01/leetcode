package org.example.maximumNumberOfStringPairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }


}