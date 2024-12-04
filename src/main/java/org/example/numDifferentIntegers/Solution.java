package org.example.numDifferentIntegers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDifferentIntegers("2393706880236110407059624696967828762752651982730115221690437821508229419410771541532394006597463715513741725852432559057224478815116557380260390432211227579663571046845842281704281749571110076974264971989893607137140456254346955633455446057823738757323149856858154529105301197388177242583658641529908583934918768953462557716z97438020429952944646288084173334701047574188936201324845149110176716130267041674438237608038734431519439828191344238609567530399189316846359766256507371240530620697102864238792350289978450509162697068948604722646739174590530336510475061521094503850598453536706982695212493902968251702853203929616930291257062173c79487281900662343830648295410"));
    }
    public int numDifferentIntegers(String word) {
        // first replace each digit character with a space
        // second extract each integer from formatted word
        // create a set from extracted integers
        // return set size

        char[] formatted_word = replaceLettersWithSpace(word);
        List<Double> extracted_integers = extractIntegers(formatted_word);
        Set<Double> set_of_integers = new HashSet<>(extracted_integers);
        return set_of_integers.size();
    }

    private List<Double> extractIntegers(char[] formattedWord) {
        List<String> array_of_strings = extractStrings(formattedWord);
        List<Double> array_of_integers = new ArrayList<>();
        for (int i = 0; i < array_of_strings.size() ; i++) {
            array_of_integers.add(parseInteger(array_of_strings.get(i)));
        }
        return array_of_integers;
    }

    private Double parseInteger(String s) {
        Double result = (double) 0;
        int power = s.length();
        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - '0') * Math.pow(10,power - 1);
            power--;
        }
        return result;
    }

    private List<String> extractStrings(char[] formattedWord) {

        boolean skipSpaceWithOutSideEffect = true;
        int indexOfLastChar = indexOfLastChar(formattedWord);
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i <= indexOfLastChar; i++) {
            if (formattedWord[i] != ' '){
                temp.append(formattedWord[i]);
                skipSpaceWithOutSideEffect = false;
            } else {
                if (!skipSpaceWithOutSideEffect){
                    result.add(temp.toString());
                    skipSpaceWithOutSideEffect = true;
                    temp = new StringBuilder();
                }
            }
        }
        if (!temp.isEmpty()) result.add(temp.toString());
        return result;
    }

    private int indexOfLastChar(char[] formattedWord) {
        int indexOfLastChar = -1;
        for (int i = 0; i < formattedWord.length; i++) {
            if (formattedWord[i] != ' ') indexOfLastChar = i;
        }
        return indexOfLastChar;
    }

    private char[] replaceLettersWithSpace(String word) {
        char[] result = new char[word.length()];
        int index = 0;
        for (char c :
                word.toCharArray()) {
            result[index++] = c >= '0' && c <= '9' ? c : ' ';
        }
        return result;
    }
}