package org.example.simplifyPath;

import java.util.List;
import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        String[] fragments = path.split("/");

        Stack<String> stack = new Stack<>();

        for (String fragment : fragments) {
            if (fragment.equals("..")) {
                if (!stack.empty())
                    stack.pop();
            } else if (fragment.equals(".") || fragment.isEmpty()) {
                continue;
            } else {
                stack.push(fragment);
            }
        }

        if (stack.empty()) return "/";

        StringBuilder result = new StringBuilder();

        while (!stack.empty()){
            result.append("/").append(stack.firstElement());
            stack.remove(0);
        }

        return result.toString();
    }
}