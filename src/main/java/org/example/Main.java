package org.example;

import org.example.destCity.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> list = new ArrayList<>();
        list.add(List.of("London", "New York"));
        list.add(List.of("New York", "Lima"));
        list.add(List.of("Lima", "Sao Paulo"));
        System.out.println(solution.destCity(list));
    }
}