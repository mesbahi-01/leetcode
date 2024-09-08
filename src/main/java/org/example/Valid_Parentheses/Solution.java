package org.example.Valid_Parentheses;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // return false if the length of the string is odd
        // use a stack
        // creat a hasmap of the following pairs () ,[] , {}
        // for each s[i]
            // if it is one of the opening parentheses add it to the stack
            // else pop from the stack and compare
            // if it is not the corresponding closing one return false
        // return stack.size() == 0
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if (map.get(c) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}