package org.example.sortSentence;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String sortSentence(String s) {
        // create a map index:string
        // collect strings using " " and return it

        Map<Integer,String> index_word_map = new HashMap<>();

        StringBuilder word = new StringBuilder();
        StringBuilder index = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))){
                word.append(s.charAt(i));
            }else if (Character.isDigit(s.charAt(i)) ){
                index.append(s.charAt(i));
            }else{
                index_word_map.put(Integer.parseInt(index.toString()),word.toString());
                word = new StringBuilder();
                index = new StringBuilder();
            }
        }

        
        if (!word.isEmpty() && !index.isEmpty()) index_word_map.put(Integer.parseInt(index.toString()),word.toString());

        StringBuilder result  = new StringBuilder();
        for (int i = 1; i <= index_word_map.size(); i++) {
            result.append(index_word_map.get(i));
            if (i + 1 <= index_word_map.size()) result.append(" ");
        }
        return result.toString();
    }

}