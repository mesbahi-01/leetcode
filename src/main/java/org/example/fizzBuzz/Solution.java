package org.example.fizzBuzz;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        return new java.util.AbstractList<String>() {
            public String get(int i) {
                if ((i+1) % 15 == 0) return "FizzBuzz";
                else if ((i+1) % 3 == 0) return "Fizz";
                else if ((i+1) % 5 == 0) return "Buzz";
                else return Integer.toString((i+1));
            }
            public int size() {
                return n;
            }
        };
    }
}