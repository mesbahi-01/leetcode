package org.example.productExceptSelf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        Map<Integer, Integer> index_totalProductOfUpcomingValues_map = new HashMap<>();
        Map<Integer, Integer> index_totalProductOfPreviousValues_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            output[i] = calculateProductOfPreviousValues(nums, i, index_totalProductOfPreviousValues_map)
                    * calculateProductOfUpcomingValues(nums, i, index_totalProductOfUpcomingValues_map);
        }


        return output;
    }

    private int calculateProductOfUpcomingValues(int[] nums, int i, Map<Integer, Integer> indexTotalProductOfUpcomingValuesMap) {
        if (i >=nums.length - 1 ) return 1;
        else {
            indexTotalProductOfUpcomingValuesMap.put(
                    i,
                    nums[i + 1] *
                            calculateProductOfUpcomingValues(nums,i + 1,indexTotalProductOfUpcomingValuesMap)
            );

            return indexTotalProductOfUpcomingValuesMap.get(i);
        }

    }

    private int calculateProductOfPreviousValues(int[] nums, int i, Map<Integer, Integer> indexTotalProductOfPreviousValues_map) {
        if (i <= 0) return 1;
        else {
            indexTotalProductOfPreviousValues_map.put(
                    i,
                    nums[i - 1] * calculateProductOfPreviousValues(nums, i - 1, indexTotalProductOfPreviousValues_map)
            );
        }
        return indexTotalProductOfPreviousValues_map.get(i);
    }
}  
