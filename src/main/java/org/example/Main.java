package org.example;

import org.example.numUniqueEmails.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System
                .out.
                println(
                        solution
                                .numUniqueEmails(new String[]{"test.email+alex@leetcode.com",
                                        "test.e.mail+bob.cathy@leetcode.com",
                                        "testemail+david@lee.tcode.com"
                                }));
    }

}