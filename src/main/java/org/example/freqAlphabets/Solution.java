package org.example.freqAlphabets;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)!='#'){
                //single digit mapping
                int a=s.charAt(i)-'0';
                sb.append((char)(96+a)); //mapping to correspondig letter
                i--;
            }
            else{
                int a=(s.charAt(i-2)-'0') * 10+(s.charAt(i-1)-'0');
                sb.append((char) (a+96));
                i-=3;
            }
        }
        return sb.reverse().toString();
    }
}