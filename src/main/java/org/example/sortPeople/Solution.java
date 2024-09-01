package org.example.sortPeople;

import java.util.Arrays;

public class Solution {
    public String[][] sortPeople(String[][] names_heights) {
        // use merge sort to sort the names_heights array
        if (names_heights.length < 2) {
            return names_heights;
        }

        int mid = names_heights.length / 2;
        String[][] left = new String[mid][2];
        String[][] right = new String[names_heights.length - mid][2];

        for (int i = 0; i < mid; i++) {
            left[i] = names_heights[i];
        }

        for (int i = mid; i < names_heights.length; i++) {
            right[i - mid] = names_heights[i];
        }

        left = sortPeople(left);
        right = sortPeople(right);

        return merge(left, right);
    }

    private String[][] merge(String[][] left, String[][] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = 0;
        String[][] merged = new String[left.length + right.length][2];

        while (leftIndex < left.length && rightIndex < right.length) {
            if (Integer.parseInt(left[leftIndex][1]) > Integer.parseInt(right[rightIndex][1])) {
                merged[mergedIndex] = left[leftIndex];
                leftIndex++;
            } else {
                merged[mergedIndex] = right[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }

        while (leftIndex < left.length) {
            merged[mergedIndex] = left[leftIndex];
            leftIndex++;
            mergedIndex++;
        }

        while (rightIndex < right.length) {
            merged[mergedIndex] = right[rightIndex];
            rightIndex++;
            mergedIndex++;
        }

        return merged;
    }

    public String[] sortPeople(String[] names, int[] heights) {


        int n = names.length;
        String[][] names_heights = new String[n][2];
        for (int i = 0; i < n; i++) {
            names_heights[i][0] = names[i];
            names_heights[i][1] = String.valueOf(heights[i]);
        }

        String[][] sortedNamesHeights = sortPeople(names_heights);
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = sortedNamesHeights[i][0];
        }
        return sortedNames;
    }
}