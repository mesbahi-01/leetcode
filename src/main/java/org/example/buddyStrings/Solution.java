package org.example.buddyStrings;

public class Solution {
    public boolean buddyStrings(String s, String goal) {
        // if s.length != goal.length return false;
        // declare a variable called differences_counter and set it to 0
        // declare a string str_one and str_two
        // set them to emptyString
        // foreach s[i] and goal[i]
        // if s[i] != goal[i]
        // differences_counter++
        // if differences_counter == 1
        // str_one = s[i] + goal[i]
        // else if(differences_counter == 2)
        // str_two = goal[i] + s[i]
        // if str_two does not equal str_one return false
        // else return false because there is more than one swap
        // if differences_counter == 0 return false
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)){
            boolean swapCanAccure = false;
                int[] frequency = new int[128];
                for (char c :
                        s.toCharArray()) {
                    frequency[c]++;
                    if (frequency[c] > 1) {
                        swapCanAccure = true;
                        break;
                    }
                }
                return swapCanAccure;
        }
        int differences_counter = 0;

        StringBuilder str_one = new StringBuilder(2);
        StringBuilder str_two = new StringBuilder(2);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                differences_counter++;
                if (differences_counter == 1) {
                    str_one.append(s.charAt(i)).append(goal.charAt(i));
                } else if (differences_counter == 2) {
                    str_two.append(goal.charAt(i)).append(s.charAt(i));
                    if (str_one.compareTo(str_two) != 0) return false;
                } else return false;
            }
        }
        if (differences_counter == 2) return true;
        else return false;
    }
}