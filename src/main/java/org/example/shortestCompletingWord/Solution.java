package org.example.shortestCompletingWord;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // creat a licensePlate_characters and those char must be in lowercase;
        // calculate the frequency of each character in licensePlate_characters
        // foreach word
        // calculate the frequency of each char in word
        // compare both tables of frequency table_frequency_for_word and table_frequency_for_licensePlate
        // if table_frequency_for_licensePlate[i] != 0 && table_frequency_for_licensePlate[i] < table_frequency_for_word[i]
        // skip this word
        // if every element of that table satisfies the condition
        // then add it to the list of possible solutions
        // now for each possible solution
        // find the one with min length and return it

        char[] licensePlate_characters = new char[licensePlate.length()];
        int j = 0;
        for (int i = 0; i < licensePlate.length(); i++) {
            if (licensePlate.charAt(i) <= 'z' && licensePlate.charAt(i) >= 'a') {
                licensePlate_characters[j] = licensePlate.charAt(i);
                j++;
            } else if (licensePlate.charAt(i) <= 'Z' && licensePlate.charAt(i) >= 'A') {
                licensePlate_characters[j] = Character.toLowerCase(licensePlate.charAt(i));
                j++;
            }
        }


        int[] table_frequency_for_licensePlate_characters = charactersFrequency(new String(licensePlate_characters, 0, j));
        List<String> list_of_possible_solutions = new LinkedList<>();
        for (String word :
                words) {
            int[] table_frequency_for_word = charactersFrequency(word);
            boolean word_is_possible_solution = true;
            for (int i = 0; i < table_frequency_for_word.length; i++) {
                if (table_frequency_for_licensePlate_characters[i] != 0
                ) {
                    if (table_frequency_for_word[i] < table_frequency_for_licensePlate_characters[i] ) {
                        word_is_possible_solution = false;
                        break;
                    }
                }
            }
            if (word_is_possible_solution) list_of_possible_solutions.add(word);
        }
        /* find the word with the minimum length*/
        String word_with_minimum_length = list_of_possible_solutions.get(0);
        for (String word :
                list_of_possible_solutions) {
            if (word.length() < word_with_minimum_length.length())
                word_with_minimum_length = word;
        }
        return word_with_minimum_length;

    }

    public int[] charactersFrequency(String s) {
        int[] frequencyTable = new int[26];
        for (char c :
                s.toCharArray()) {
            frequencyTable[c - 'a']++;
        }
        return frequencyTable;
    }
}