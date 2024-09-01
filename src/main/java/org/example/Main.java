package org.example;
import org.example.restoreString.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(
                s.restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 })
        );
    }
}