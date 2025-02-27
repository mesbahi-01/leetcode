package org.example.clearDigits;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c:s.toCharArray()){
            if (c <= '9' && c >= '0'){
                if (stack.isEmpty()){
                    // do nothing
                }else{
                    stack.pop();
                }
            }else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder(stack.size());

        for (int i = 0; i < stack.size(); i++) {
            result.append(stack.get(i));
        }

        return result.toString();
    }
}