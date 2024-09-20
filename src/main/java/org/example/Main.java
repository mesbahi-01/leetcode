package org.example;

import org.example.findTheDifference.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheDifference("abcd", "abcde"));
        int a = 5;// 101
        int b = 7;// 111
        a = a ^ b;// 101 ^ 111 = 010
        b = a ^ b;// 010 ^ 111 = 101
        a = a ^ b;// 010 ^ 101 = 111
        System.out.println("a = " + a + " b = " + b);

    }
}